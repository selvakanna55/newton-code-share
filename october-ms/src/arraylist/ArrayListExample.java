package arraylist;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("Begin");
        int arr[] = new int[4];// [0,0,0,0]
        arr[0] = 10;
        arr[1] = 20;
        int n = arr.length;
//        System.out.println(arr[0]);

        ArrayList<Integer> li1 = new ArrayList<>();
        li1.add(10); // insert at the end
        li1.add(0, 20); // arr[0] = 20
        System.out.println(li1.get(0)); //arr[0]
        n = li1.size();
        for (int i = 0; i < n; i++) {
            System.out.print(li1.get(i) + " ");
        }




//
//
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        arr2.add(0, 10); // insert at 0 index or insert at middle
//        arr2.add(10); //add to the end arr2.add(1, 10);
//        System.out.println(arr2.get(0)); //arr[0] value at particular index
//
//        int nn = arr2.size(); // get the length
//        System.out.println(arr2.indexOf(30)); // search for a number
////        arr2.clear(); // erase all elements [10, 20, 30] -> []
//        arr2.remove(0); //remove index [10, 20, 30] -> [20, 30]
//        Integer num = 20;
//        arr2.remove(num);  // remove value [10, 20, 30] -> [10, 30]
//        System.out.println("End");
//
//        int row = 3;
//        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
//        for (int i = 0; i < row; i++) {
//            li.add(0, new ArrayList<>());
//        }
//        ArrayList<Integer> r = new ArrayList<>();
//        r.add(10);
//        r.add(20);
//        li.set(0, r);
////        li.get(0).add(10);
////        li.get(1).add(90);

        int matrix[][] = new int[5][5];
        int arr1D[] = {10, 20, 30, 40, 50};
        matrix[0][0] = arr1D[1]; //possible
        matrix[1] = arr1D;

    }
}
