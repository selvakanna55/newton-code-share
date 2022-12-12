package assignments;

public class Pattern {


    static void Pattern(int N) {
        System.out.println("*");//1

        for (int i = 2; i < N; i++) { //2,3,4
            System.out.print("*");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("^");
            }
            System.out.print("*");
            System.out.println();
        }


        for (int i = 1; i <= N + 1; i++) { //5
            System.out.print("*");
        }
    }
}