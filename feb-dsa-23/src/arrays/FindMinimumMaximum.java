package arrays;

import java.util.Arrays;

public class FindMinimumMaximum {
    public static void main(String[] args) {
//        int arr[] = {8, 7, -4, 3, 88, 2, 9};
        int arr[] = {8, 7, -4, 19};
        // minimum -> smallest = -4
        // maximum -> largest = 88
        int mini = arr[0];
        int maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini) { // mini
                mini = arr[i];
            }
            if (arr[i] > maxi) { //maxi
                maxi = arr[i];
            }
        }
        System.out.println(mini + " " + maxi);
//        Arrays.sort(arr); // nlogn
//        System.out.println(arr[0] + " " + arr[arr.length - 1]);

    }
}
