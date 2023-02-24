package contest2;

import java.util.Scanner;

public class InsuranceClaim {
    public static void main(String[] args) {
        // car insurance company
        // maximum amount can be paid on car repair -> X INR
        // current car repair bill value -> Y INR
        // given X,Y print the amount that has to be paid by insurance company

        // example
        // max claim, bill value
        // 5 3 -> 3
        // 5 9 -> 5
        // 7 4 -> 4
        // 18 28 -> 18
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int x = sc.nextInt(); // maximum claim insurance company will pay
            int y = sc.nextInt(); // repair cost

            if (x < y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
    }
}
