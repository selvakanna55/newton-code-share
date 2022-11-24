package batch_assignments;

import java.util.*;

public class OperationsOnArrayList {
    public static void insert(ArrayList<Integer> list, int x) {
        list.add(x); // add to the end
    }

    public static void IncOrder(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void Search(ArrayList<Integer> list, int val) {
        System.out.print(list.indexOf(val) + " ");
    }

    public static void DecOrder(ArrayList<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
    }
}
