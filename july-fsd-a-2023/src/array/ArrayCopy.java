package array;


import java.util.*;

class ArrayCopy {
    public static void main(String args[]) {
        int arr[] = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(Arrays.toString(arr));

        // creating new array, as old array size cannot be increased
        int arr2[] = new int[2 + 2];
        // copy values
        for (int i = 0; i < 2; i++) {
            arr2[i] = arr[i];
        }
        arr2[2] = 30;
        arr2[3] = 40;

        System.out.println(Arrays.toString(arr2));

    }

    // create array - size - old size + new elements ( 2+ 1)
    // copy values?
}