package array;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        // 5 number. 10 20 30 40 50
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        //array is homogenous datatype.
        //every value is of same type
//        int numbers[] = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;


//        int numbers[] = {10, 20, 30, 40, 50};


        //[10, 20, 30, 40, 50]
//        int n = 5;
//        int numbers[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = (i + 1) * 10;
//        }
//        System.out.println(numbers[1]);
        // store n number and print sum of it


        //intput
        //N = 5;
        // 1 2 3 4 5. sum 15
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);


    }
}
