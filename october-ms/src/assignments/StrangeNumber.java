package assignments;

public class StrangeNumber {
    public static void main(String[] args) {
        // nlogn
        int n = 3;
//        System.out.println((n - 1) * 9);
        int strange = 0;
        for (int count = 1; count < n; count++) {
            while (true) {
                strange++;

                int num = strange;
                int sum = 0;
                while (num > 0) {
                    int lastDigit = num % 10;
                    sum = sum + lastDigit;
                    num = num / 10;
                }
                if (sum % 9 == 0) break;

            }
        }
        // n^2
        System.out.println(strange);
    }
}
