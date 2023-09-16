package basic;

public class PrintfExample {
    public static void main(String[] args) {

        double num = 10.3689;

        // 2 decimal
        System.out.printf("%.2f", num); // 10.37
        System.out.println();

        // 3 decimal
        System.out.printf("%.3f", num);
        System.out.println();

        // 3 decimal
        System.out.printf("%.9f", num);
        System.out.println();

        int num2 = 113;
        System.out.println(num2 * (20 / 100)); // 0
        System.out.println((num2 * 20) / 100); // 22

        System.out.println(num2 * (20.0 / 100.0)); //22.6

    }
}
