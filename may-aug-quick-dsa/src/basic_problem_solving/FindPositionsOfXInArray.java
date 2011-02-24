package basic_problem_solving;// https://my.newtonschool.co/playground/code/f0drb35u3ak9

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FindPositionsOfXInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int test = 0; test < testCase; test++) {
            int n = scan.nextInt();
            int target = scan.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            // search
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    found = true;
                    System.out.print(i + " ");
                }
            }

            if (!found) {
                System.out.print("Not found");
            }
            System.out.println();

        }
    }
}