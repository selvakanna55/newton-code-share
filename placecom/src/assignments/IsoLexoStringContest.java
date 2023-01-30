package assignments;


import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class IsoLexoStringContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        HashMap<Character, Character> hm = new HashMap<>();
        int n = word.length();
        char ch = 'a';
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            char curr = word.charAt(i);
            if (!hm.containsKey(curr)) { //new char -> assign new
                hm.put(curr, ch);
                ch++;
            }
            sb.append(hm.get(curr));
        }
        System.out.println(sb);
    }
}