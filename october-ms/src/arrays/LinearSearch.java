package arrays;

import java.util.*;
import java.lang.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //1
        int arr[] = new int[n]; //n
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();

        boolean find = false;
        for (int i = 0; i < n; i++) { // O(n)
            if (arr[i] == num) {
                find = true;
                break;
            }
        }


        System.out.println(find);
    }
}
