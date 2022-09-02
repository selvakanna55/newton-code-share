package basics;

public class FunctionsBasics {
    // public static return type function name
//    public static int addTwoNumber(int number1, int number2) {
//        int sumOfTwoNumber = number1 + number2;
//        return sumOfTwoNumber;
//    }

    public static double sumOfTwo(double a, double b) {
        double sum = a + b;
        return sum;
    }


    public static void printHello() {
        // function defnition
        System.out.println("hello");
        System.out.println("123");
        System.out.println("jrhf");
    }

    public static void main(String[] args) {
        System.out.println("begin");
        double a = 10.5;
        double b = 9.9;
        double sum = sumOfTwo(a, b);
        System.out.println(sum);
        System.out.println("end");
    }
}
