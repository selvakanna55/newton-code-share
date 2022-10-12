package batch_assignments;

import java.io.*;
import java.util.*;

class MinimizeXOR {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] nextLine = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nextLine[i]);
        }

        Arrays.sort(arr);

        int minimum = 10000001;
        for (int i = 0; i < n - 1; i++) {
            int xor = arr[i] ^ arr[i + 1];
            minimum = Math.min(minimum, xor);
        }
        System.out.println(minimum);
    }
}