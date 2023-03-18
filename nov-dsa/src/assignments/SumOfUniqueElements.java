package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumOfUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        long sum = 0;
        for (int num : hm.keySet()) {
            if (hm.get(num) == 1) {
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}
