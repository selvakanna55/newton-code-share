package arraylist;

import java.util.Arrays;

public class ArrayFiniteness {
    public static void main(String[] args) {
        int arr1[] = new int[3]; // ["a", "v","ed"]  [1.9, 2.9]

        // fixed size
        // multiple datatype
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        // i want to insert 3 more elements
        int arr2[] = new int[6];
        for (int i = 0; i < 3; i++) {
            arr2[i] = arr1[i];
        }
        //more add
        arr1 = arr2;
        arr1[3] = 99;
        arr1[4] = 88;
        arr1[5] = 77;


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        Arrays.sort(arr1);
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


    }
}
