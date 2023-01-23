package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class BadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ans = true;
                    break;
                }
            }
            if (ans == true) {
                break;
            }
        }
        if (ans == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}