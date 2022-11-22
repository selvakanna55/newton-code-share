package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class NNContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * (n - 1));
    }
}