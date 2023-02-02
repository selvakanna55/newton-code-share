package assignments;


import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class WordPatternCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String arr[] = sc.nextLine().split(" "); //"like dislike dislike like" ->
        //["like","dislike","dislike","like"]
        HashMap<Character, String> hm = new HashMap<>();
        boolean ans = true;
        int idx = 0;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (hm.containsKey(ch)) {
                if (!hm.get(ch).equals(arr[idx])) {
                    ans = false;
                    break;
                }
            } else {
                hm.put(ch, arr[idx]);
            }
            idx++;
        }
        System.out.println(ans);

        // pattern len > arr len
        // arr len < pattern len
    }
}