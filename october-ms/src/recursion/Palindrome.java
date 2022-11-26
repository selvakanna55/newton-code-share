package recursion;

public class Palindrome {
    static boolean check_Palindrome(String str, int s, int e) {
        int n = str.length();
//        for (int i = 0; i < n / 2; i++) {
//            s = i;
//            e = n - i - 1;
//            if (str.charAt(s) != str.charAt(e)) {
//                return false;
//            }
//        }
//        return true;
        s = 0;
        e = n - 1;
        while (s <= e) {
            System.out.println(s + " " + e);
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "ABCBA";
        System.out.println(check_Palindrome(word, 0, 0));
    }
}
