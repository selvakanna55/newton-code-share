package arrays;

import java.util.Scanner;

public class ArrayBasic1 {
    void basic1() {
        //        // new -> allocate new memory in computer
        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        int d = scan.nextInt();
//        int e = scan.nextInt();
//        int f = scan.nextInt();
//        int e = scan.nextInt();
//
//        a = 90;
//        System.out.println(a);
        int nums[] = new int[4];
        //array is homogenous datatype
        // array is non primitive datatype with all elements of same type
        // 0, 1, 2, 3
        // input from user
//        nums[0] = scan.nextInt();
//        nums[1] = scan.nextInt();
//        nums[2] = scan.nextInt();
//        nums[3] = scan.nextInt();
        for (int i = 0; i < 4; i++) {
            nums[i] = scan.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(nums[0]);
        }
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

    }

    void printSum() {
        int n = 5; // 1+2+3+4+5 = 15
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[4];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println(sum);
        System.out.println("end");
    }
}
