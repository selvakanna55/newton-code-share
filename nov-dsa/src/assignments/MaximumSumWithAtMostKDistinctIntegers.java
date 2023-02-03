package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumSumWithAtMostKDistinctIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr); // 1. sort the array

        long sum = arr[0];
        ArrayList<Long> li = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                sum = sum + arr[i];
            } else {
                li.add(sum);
                sum = arr[i];
            }
        }
        li.add(sum);
        Collections.sort(li, Collections.reverseOrder());

        long ans = 0;

        for (int i = 0; i < Math.min(li.size(), k); i++) {
            if (li.get(i) <= 0) {
                break;
            }
            ans = ans + li.get(i);
        }
        System.out.println(ans);
    }
}