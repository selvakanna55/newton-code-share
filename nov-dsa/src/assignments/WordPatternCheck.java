package assignments;

import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class WordPatternCheck {
    public static void main(String[] args) {
        HashMap<Character, String> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String pattern = sc.next();
        boolean ans = true;
        for (int i = 0; i < pattern.length(); i++) {
            String word = sc.next();
            char ch = pattern.charAt(i);
            if (hm.containsKey(ch)) {
                if (!word.equals(hm.get(ch))) {
                    ans = false;
                    break;
                }
            } else {
                hm.put(ch, word);
            }
        }
        System.out.println(ans);
    }
}