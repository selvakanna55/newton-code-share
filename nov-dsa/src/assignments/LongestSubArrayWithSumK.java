package assignments;

    import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class LongestSubArrayWithSumK {
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

            HashMap<Long, Integer> hm = new HashMap<>();
            long sum = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
                if (sum == k) {
                    ans = i + 1;
                }
                if (hm.containsKey(sum - k)) {
                    int len = i - hm.get(sum - k);
                    if (ans < len) {
                        ans = len;
                    }
                }
                if (!hm.containsKey(sum)) {
                    hm.put(sum, i);
                }
            }
            System.out.println(ans);
        }
    }
}