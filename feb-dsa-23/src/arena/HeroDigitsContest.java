package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class HeroDigitsContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstDigit = sc.nextInt();
        int secondDigit = sc.nextInt();
        if (secondDigit != 0 && firstDigit / secondDigit == firstDigit % secondDigit) {
            System.out.println("Hero digits");
        } else {
            System.out.println("Non-Hero digits");
        }


    }
}