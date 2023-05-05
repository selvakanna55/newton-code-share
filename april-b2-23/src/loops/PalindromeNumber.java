package loops;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12321;
        int num = n;
        int reversedNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(reversedNum);


        if (n == reversedNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
