package assignments;

import java.util.*;

class YetAnotherSortingProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        if (m < n / 2) {
            Arrays.sort(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            ArrayList<Integer> li = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i <= m && i >= n - m - 1)
                    continue;
                li.add(arr[i]);
            }
            Collections.sort(li);
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if (i <= m && i >= n - m - 1) {
                    System.out.print(arr[i] + " ");
                } else {
                    System.out.print(li.get(idx) + " ");
                    idx++;
                }
            }
        }

        // sort(arr, 0, n-1);

        // for(int i=0; i<n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println();
    }
}