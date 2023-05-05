package arrays;


import java.util.*;

class SimpleArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}


// arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;
//         arr[3] = 99;

// System.out.println(arr[0]); // 10
//    System.out.println(arr[1]); // 10
//         // System.out.println(arr[2]); // 10
//         // System.out.println(arr[3]); // 10