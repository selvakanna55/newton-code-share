import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SubarraysWithEqual1sAnd0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) { // change 0 to -1, find sub arrays with sum as 0
                arr[i] = -1;
            }
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        //     sum, frequency
        int sum = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == 0) { // sum from 0 to i is 0, so increase the count
                count++;
            }
            if (hm.containsKey(sum)) {
                int val = hm.get(sum);
                count = count + val;
                hm.put(sum, val + 1);
            } else {
                hm.put(sum, 1);
            }
        }
        System.out.println(count);
    }
}