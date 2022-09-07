package Assignments;

public class MagicNumber {

    public static boolean isMagicNumber(int num) {
        boolean seven = false;
        boolean nine = false;
        while (num != 0) {
            int lastDigit = num % 10;
            num = num / 10;
            if (lastDigit == 9) {
                nine = true;
            } else if (lastDigit == 7) {
                seven = true;
            }
        }
        return seven && nine;
    }

    static int MagicNumber(int N) {
        int left = N;
        int right = N;
        while (true) {
            if (isMagicNumber(left)) {
                return left;
            }
            left--;
            if (isMagicNumber(right)) {
                return right;
            }
            right++;
        }
    }
}