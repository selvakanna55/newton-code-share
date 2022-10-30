package arrays;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int a = 51;
//        int b = 22;
//        int c = 39;
//        int d = 44;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        int n = 3;
//        //declare, initialized
//        float nums[] = new float[n]; // create an array
//        for (int i = 0; i < n; i++) {
//            nums[i] = scan.nextFloat();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(nums[i] + " ");
//        }

        int num1[]; //declare
        num1 = new int[4]; //initialization

        int nums2[] = new int[4];
        int nums1[] = {10, 4754, 5454, 96, 76};
        for (int i = 0; i < 5; i++) {
            System.out.print(nums1[i] + " ");
        }


    }
}
