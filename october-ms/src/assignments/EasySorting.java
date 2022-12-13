package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class EasySorting {
    static int compare(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            int num1 = (int) s1.charAt(i);
            int num2 = (int) s2.charAt(j);
            if (num1 != num2) {
                return num1 - num2;
            }
            i++;
            j++;
        }
        if (n1 != n2) {
            return n1 - n2;
        } else {
            return 0;
        }
    }

    static void bubbleSort(String arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (compare(arr[j], arr[j + 1]) > 0) { // 20>10
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}