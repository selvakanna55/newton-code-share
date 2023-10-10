package timespace;

public class TimeAllInOne {

    public static void logn() {
        int n = 256;
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("Hello World");
        }
    }

    public static void one() {
        System.out.println("Hello");
        System.out.println("How are you?");
    }

    public static void nTime() {
        int n = 3;
        for (int i = 1; i <= n; i++) {

            System.out.println("hi");

        }

        System.out.println("End");
    }


    public static void nSquare() {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        int n = 3;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void twoN() {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            System.out.println("Hi");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
    }

    public static void main(String[] args) {

    }
}
