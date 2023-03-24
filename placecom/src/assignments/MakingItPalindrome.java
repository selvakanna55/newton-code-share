package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MakingItPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = i;
            boolean isPalindrome = true;
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    isPalindrome = false;
                    break;
                }
                end--;
                start++;
            }
            if (isPalindrome) {
                count = i + 1;
            }
        }
        System.out.println(n - count);
    }
}