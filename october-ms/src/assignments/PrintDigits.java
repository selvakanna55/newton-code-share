package assignments;

public class PrintDigits {
    static void Print_Digits(int N) {
        int len = 1;
        int num = N;
        while (num > 9) {
            num = num / 10;
            len = len * 10;
        }
        while (len > 0) {
            int div = N / len;
            int lastDigit = div % 10;
            switch (lastDigit) {
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
            len = len / 10;
        }
    }
}