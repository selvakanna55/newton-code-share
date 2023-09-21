package functions;


// don't change the name of this class
// you can add inner classes if needed
class DigitSum {
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10); // add lastDigit to the sum
            num = num / 10; // remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // System.out.println(digitSum(123));
        // System.out.println(digitSum(654));
        int sum = 0;
        int n = 546;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println((n * (n + 1)) / 2);
    }
}