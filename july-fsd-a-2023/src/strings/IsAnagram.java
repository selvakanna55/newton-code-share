package strings;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isAnagram(String s, String t) {
            int sFreq1[] = new int[26]; //
            int n1 = s.length();
            for (int i = 0; i < n1; i++) {
                int index = s.charAt(i) - 'a';
                sFreq1[index] = sFreq1[index] + 1;
            }
            System.out.println(Arrays.toString(sFreq1));

            int tFreq2[] = new int[26];
            int n2 = t.length();
            for (int i = 0; i < n2; i++) {
                int index = t.charAt(i) - 'a';
                tFreq2[index] = tFreq2[index] + 1;
            }
            System.out.println(Arrays.toString(tFreq2));

            boolean ans = true;
            for (int i = 0; i < 26; i++) {
                if (sFreq1[i] != tFreq2[i]) { // mimstach in conut leads to not an anagram
                    ans = false;
                    break;
                }
            }
            return ans;
        }
    }
}
