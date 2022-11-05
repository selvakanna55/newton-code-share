import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class LongestSubstringWithEvenNumberOfVowels {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String str = r.nextLine();
        System.out.println(longest(str));
    }

    static int longest(String str) {
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        // System.out.println(count);
        if (count % 2 == 0) return n;

        int start = 0;
        char ch = str.charAt(start);
        while (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            start++;
            ch = str.charAt(start);
        }

        int end = n - 1;
        ch = str.charAt(end);
        while (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            end--;
            ch = str.charAt(end);
        }
        int miniLen = Math.min(start, n - end - 1);
        return n - miniLen - 1;
        // System.out.println(n-miniLen-1);

    }
}