package assignments;


import java.util.Scanner;
import java.util.TreeMap;

// don't change the name of this class
// you can add inner classes if needed
class RepeatedSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = word.length();
        TreeMap<String, Integer> freq = new TreeMap<>();
        for (int i = 0; i <= n - 10; i++) {
            String curr = word.substring(i, i + 10);
            if (freq.containsKey(curr)) {
                int count = freq.get(curr);
                freq.put(curr, count + 1);
            } else {
                freq.put(curr, 1);
            }
        }
        boolean ans = false;
        for (String curr : freq.keySet()) {
            if (freq.get(curr) > 1) {
                ans = true;
                System.out.print(curr + " ");
            }
        }
        if (!ans) {
            System.out.println(-1);
        }
    }
}