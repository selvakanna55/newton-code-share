package loop;

public class Pattern1 {

    public static void main(String[] args) {
        /*
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
         */
        int n = 5;
        for (int i = 1; i <= n; i++) { // how many rows?
            for (int j = 1; j <= n; j++) {  //decreasing for loop
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
            5 4 3 2 1
            5 4 3 2 1
            5 4 3 2 1
            5 4 3 2 1
            5 4 3 2 1
         */
        int n4 = 5;
        for (int i = 1; i <= n4; i++) { // how many rows?
            for (int j = n4; j >= 1; j--) {  //decreasing for loop
                System.out.print(j + " ");
            }
            System.out.println();
        }


        /*
            1 2 3
            1 2 3
            1 2 3
            1 2 3
            1 2 3
         */
        int n2 = 5;
        for (int i = 1; i <= n2; i++) { // how many rows?
            for (int j = 1; j <= 3; j++) {  //decreasing for loop
                System.out.print(j + " ");
            }
            System.out.println();
        }


         /*
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
        */
        int n6 = 5;
        for (int i = 1; i <= n6; i++) {
            for (int j = 1; j <= (n6 - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        int n1 = 5;
        for (int i = 1; i <= n1; i++) { // how many rows?
            for (int j = 1; j <= n1; j++) {  //decreasing for loop
                System.out.print("* ");
            }
            System.out.println();
        }


        int n5 = 5;
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 1; i <= n5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}