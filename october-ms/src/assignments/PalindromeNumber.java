package assignments;

public class PalindromeNumber {
    static void isPalindrome(int N) {
        int rev = 0; // 0-> 1 -> 12
        int num = N; //121 -> 12 -> 1
        while (num > 0) { // 0>0 false
            int lastDigit = num % 10; //1%10 -> 1
            rev = (rev * 10) + lastDigit; //( 12*10)+1 =121
            num = num / 10; // 1/10 -> 0
        }
        if (rev == N) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
