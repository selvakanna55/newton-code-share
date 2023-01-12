package multithreading.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortMultiThread implements Callable<List<Integer>> {
    public MergeSortMultiThread(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    List<Integer> arrayToSort;


    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() < 2) {
            return arrayToSort;
        }
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        int mid = arrayToSort.size() / 2;
        for (int i = 0; i < mid; i++) {
            leftList.add(arrayToSort.get(i));
        }

        for (int j = mid; j < arrayToSort.size(); j++) {
            rightList.add(arrayToSort.get(j));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<List<Integer>> left = executorService.submit(new MergeSortMultiThread(leftList));
        Future<List<Integer>> right = executorService.submit(new MergeSortMultiThread(rightList));

        leftList = left.get();
        rightList = right.get();
        List<Integer> sorted = new ArrayList<>();
        int p1 = 0, p2 = 0, k = 0;
        int n1 = leftList.size();
        int n2 = rightList.size();

        while (p1 < n1 && p2 < n2) {
            if (leftList.get(p1) < rightList.get(p2)) {
                sorted.add(leftList.get(p1++));
            } else {
                sorted.add(rightList.get(p2++));
            }
        }
        while (p1 < n1) {
            sorted.add(leftList.get(p1++));
        }
        while (p2 < n2) {
            sorted.add(rightList.get(p2++));
        }
        executorService.shutdownNow();
        return sorted;

    }
}
