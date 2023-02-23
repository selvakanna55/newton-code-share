package loops;

public class Patterns {
    public static void main(String[] args) {
//         * * * *
//         * * * *
//         * * * *
//         * * * *
        int rows = 4;
        int cols = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n = 4;
        //*
        //* *
        //* * *
        //* * * *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }

        //       *
        //    * *
        //  * * *
        //* * * *
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        1  2  3  4
//        1  2  3
//        1  2
//        1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

    }
}
