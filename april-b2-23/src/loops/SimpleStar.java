package loops;

public class SimpleStar {
    public static void main(String[] args) {
//        // * * * * *
//        //* * * * *
//        //* * * * *
//        int stars = 5;
//        int rows = 3;
//        for (int row = 1; row <= rows; row++) {
//            for (int i = 1; i <= stars; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // * * * * *
        //* * * * *
        //* * * * *
//        //*
//        //* *
//        //* * *
//        int stars = 4;
//        int rows = 3;
//        for (int row = 1; row <= rows; row++) {
//            for (int i = 1; i <= rows - row; i++) {
//                System.out.print("  ");
//            }
//            for (int i = 1; i <= row; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <= stars; i++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//        for (int i = 1; i <= stars; i++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//        for (int i = 1; i <= stars; i++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//        for (int i = 1; i <= stars; i++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//        1
//        2 3
//        4 5 6
//        int rows = 3;
//        int number = 1;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(number + " ");
//                number = number + 1;
//            }
//            System.out.println();
//        }

        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
