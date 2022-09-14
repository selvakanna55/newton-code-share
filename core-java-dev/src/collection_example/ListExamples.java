package collection_example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExamples {
    public static void main(String[] args) {
        int arr[] = new int[5];
        List<Integer> li = new LinkedList<>();
        arr[0] = 10;
        arr[1] = 10;
        li.add(10); // at to the end
        li.add(20); // at the end
        arr[1] = 30;
        li.add(1, 30);
        System.out.println(arr[1]);
        System.out.println(li.get(1)); // 30
        li.set(1, 90);
        System.out.println(li.get(1)); // 30
        System.out.println(li.contains(10)); //O(n)
        System.out.println(li.contains(50)); //O(n);
        ArrayList<Integer> li2 = new ArrayList<>();
        li2.add(99);
        li2.add(999);
        li2.add(99);
        System.out.println(li);
        System.out.println(li2);
        li.addAll(li2);
        System.out.println(li);

    }
}
