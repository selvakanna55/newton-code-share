package assignments;

import java.util.*;

public class OperationsOnArrayList {


    public static void insert(ArrayList<Integer> list, int x) {
        list.add(x);
    }

    public static void IncOrder(ArrayList<Integer> list) {
        Collections.sort(list); //        //Arrays.sort(arr);
    }

    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val) {
        int index = -1; // number is not present
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) == val) {
                index = i;
                break;
            }
        }
        System.out.print(index + " ");
    }

    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list) {
        Collections.sort(list, Collections.reverseOrder()); //
        // Your code here
    }
}