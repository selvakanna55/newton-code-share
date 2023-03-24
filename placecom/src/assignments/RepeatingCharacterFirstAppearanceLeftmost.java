package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class RepeatingCharacterFirstAppearanceLeftmost {

    public static void main(String[] args) {
        Scanner hs = new Scanner(System.in);
        int t = hs.nextInt();
        for (int i = 0; i < t; i++) {
            boolean ans = false;
            String str = hs.next();
            int[] freq = new int[26];
            for (int j = 0; j < str.length(); j++) {
                freq[str.charAt(j) - 'a']++;
            }

            for (int k = 0; k < str.length(); k++) {
                if (freq[str.charAt(k) - 'a'] > 1) {
                    System.out.println(str.charAt(k));
                    ans = true;
                    break;
                }
            }
            if (!ans) {
                System.out.println("-1");
            }
        }

    }
}