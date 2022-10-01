package batch_assignments;


import java.util.Scanner;

class FindingVowels {
    public static void main(String[] args) {
        int lastIdx[] = new int[26];
        for (int i = 0; i < 26; i++) {
            lastIdx[i] = -1;
        }
        //arr[0] -> a
        // arr[4] -> e

        // a -> 0, b ->1, c->2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int miniLen = Integer.MAX_VALUE; // no vowel string present

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                lastIdx[ch - 'a'] = i;

                int mini = Math.min(lastIdx['a' - 'a'], Math.min(lastIdx['e' - 'a'], Math.min(lastIdx['i' - 'a'], Math.min(lastIdx['o' - 'a'], lastIdx['u' - 'a']))));
                if (mini != -1) {
                    int currLen = i - mini + 1;
                    if (miniLen > currLen) {
                        miniLen = currLen;
                    }
                }
            }
        }

        if (miniLen == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(miniLen);
        }


        //TC: O(n)
        //SC: O(1)
    }
}