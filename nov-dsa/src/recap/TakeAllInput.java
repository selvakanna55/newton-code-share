package recap;

import java.util.Scanner;

public class TakeAllInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long num1 = sc.nextLong();
        float num3 = sc.nextFloat();
        String nane = sc.next(); // sc.nextLine();
        boolean ans = sc.nextBoolean();
        char ch = sc.next().charAt(0);
    }
}