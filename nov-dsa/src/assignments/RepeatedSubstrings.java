package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// this question can be solved after solving learing hashmap
// don't change the name of this class
// you can add inner classes if needed
class RepeatedSubstrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ;
        String str = br.readLine();
        int n = str.length();
        TreeMap<String, Integer> hm = new TreeMap<>();

        for (int i = 10; i <= n; i++) {
            String curr = str.substring(i - 10, i);
            hm.put(curr, hm.getOrDefault(curr, 0) + 1);
        }
        boolean ans = false;
        for (String word : hm.keySet()) {
            if (hm.get(word) > 1) {
                ans = true;
                System.out.print(word + " ");
            }
        }
        if (!ans) {
            System.out.println(-1);
        }

    }
}