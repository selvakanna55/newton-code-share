package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class DuplicatesAtADistanceK {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n - k; i++) {
            if (arr[i] == arr[i + k]) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}