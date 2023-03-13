package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class CountSubarraysWithGivenSum {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String nums[] = br.readLine().split(" "); //[6 15]
            int n = Integer.parseInt(nums[0]); //6
            int k = Integer.parseInt(nums[1]); //15
            int arr[] = new int[n]; //
            nums = br.readLine().split(" "); //10 5 2 7 1 9
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }

            HashMap<Long, Long> hm = new HashMap<>();
            long sum = 0;
            long ans = 0;


            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum == k) {
                    ans++;
                }

                if (hm.containsKey(sum - k)) {
                    ans = ans + hm.get(sum - k);
                }

                if (hm.containsKey(sum)) {
                    long count = hm.get(sum);
                    hm.put(sum, count + 1);
                } else {
                    hm.put(sum, 1L);
                }
            }
            System.out.println(ans);
        }
    }
}