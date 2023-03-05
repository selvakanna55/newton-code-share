package arrays;

import java.util.Scanner;

class Student {
    int rollNo;
    double percentage;

    void eat() {
        System.out.println("eating");
    }
}

public class SimpleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int rollNo; // declaration
//        rollNo = 10; // initialize, assignment
//
//        int num = 10;
//        System.out.println(rollNo);
        int nums[] = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
//        nums[0] = sc.nextInt();
//        nums[1] = sc.nextInt();
//        nums[2] = sc.nextInt();
//        nums[3] = sc.nextInt();
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
