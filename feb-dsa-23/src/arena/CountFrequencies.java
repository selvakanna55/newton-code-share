package arena;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CountFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[10001];
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[val] = arr[val] + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) { // if any occurance?
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}