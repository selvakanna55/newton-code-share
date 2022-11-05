
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PairsSumDivisibleByK {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int k = r.nextInt();
        int[] arr = new int[n];
        int freq[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
            int rem = arr[i] % k;
            freq[rem]++;
        }
        // System.out.println(Arrays.toString(freq));
        long count = 0;
        count = count + ((freq[0] * (freq[0] - 1)) / 2);
        for (int i = 1; i <= (k - 1) / 2; i++) {
            int p1 = i;
            int p2 = k - i;
            count = count + (freq[p1] * freq[p2]);
        }
        if (k % 2 == 0) {
            count = count + ((freq[k / 2] * (freq[k / 2] - 1)) / 2);
        }


        System.out.println(count);


    }

    public static int countpairs(int[] arr, int n, int k) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = k - (arr[i] % k);

            if (map.containsKey(val)) {

                int freq = map.get(val);
                count++;
                map.put(val, freq + 1);
                count += freq;
            } else {
                map.put(val, 1);
            }

        }
        return count;
    }
}