package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class GrossSalaryContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Gross = 0;

        if (N <= 10000) {
            Gross = 2 * N;
        } else if (N <= 20000 && N >= 10000) {
            Gross = N + ((N * 115) / 100);
        } else {
            Gross = N + ((N * 125) / 100);
        }
        System.out.println(Gross);
    }
}