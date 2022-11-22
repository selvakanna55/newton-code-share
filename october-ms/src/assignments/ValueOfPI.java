package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ValueOfPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String pat = "%." + n + "f";
        // System.out.printf("%.4f",Math.PI);  // 4digit precession
        System.out.printf(pat, Math.PI);
    }
}