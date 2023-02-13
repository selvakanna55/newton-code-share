package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class Buildings {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int height = arr[0];
        long count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > height) {
                count++;
                height = arr[i];
            }
        }
        System.out.println(count);
    }
}