package practice;

import java.util.Scanner;

public class VarunTarun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int varun = 0;
        int tarun = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'V') {
                varun++;
            } else {
                tarun++;
            }
        }
        if (varun > tarun) {
            System.out.println("Varun");
        } else {
            System.out.println("Tarun");
        }
    }
}
