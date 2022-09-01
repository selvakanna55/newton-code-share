package Assignments;

public class PrintDigits {
    static void Print_Digits(int N) {
        int num = N;
        int digit = 1;
        while (num > 9) {
            num = num / 10;
            digit = digit * 10;
        }

        num = N;

        while (digit != 0) {
            int currDigit = (num / digit) % 10; // (1024/1000)%10 -> 1
            digit = digit / 10;
            switch (currDigit) {
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
        }
    }
}
