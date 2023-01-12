package multithreading.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArraySortApplication {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        List<Integer> li = es.submit(new MergeSortMultiThread(List.of(1, 2, 3, 9, 8, 7))).get();
        System.out.println(li);
        es.shutdownNow();
    }
}
