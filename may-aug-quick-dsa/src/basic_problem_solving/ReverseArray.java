package basic_problem_solving;
//
// https://my.newtonschool.co/playground/code/6cqdfkt9xi3u

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ReverseArray {
    private static void reverse(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        reverse(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}