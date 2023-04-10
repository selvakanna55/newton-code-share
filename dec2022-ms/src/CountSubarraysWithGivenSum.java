import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CountSubarraysWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int k = sc.nextInt();
            int count = 0;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sum = sum + num;
                if (sum == k) {
                    count++;
                }
                if (hm.containsKey(sum - k)) {
                    count = count + hm.get(sum - k);
                }
                // System.out.println(sum+" "+(sum-k)+" "+hm);

                if (hm.containsKey(sum)) {
                    int val = hm.get(sum);
                    hm.put(sum, val + 1);
                } else {
                    hm.put(sum, 1);
                }
            }
            System.out.println(count);

        }
    }
}
