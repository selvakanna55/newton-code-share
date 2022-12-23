package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RepeatedCharactersAndTheirCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();
        int freq[] = new int[26];

        for (int i = 0; i < n; i++) {
            int index = word.charAt(i) - 'a';
            freq[index] = freq[index] + 1;
        }
        // System.out.println(Arrays.toString(freq));
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                char curr = (char) (97 + i);
                System.out.println(curr + " " + freq[i]);
            }
        }
    }
}