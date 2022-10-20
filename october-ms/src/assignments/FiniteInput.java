package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FiniteInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        do {
            num = scan.nextInt();
            System.out.print(num + " ");
        } while (num != 0);

    }
}