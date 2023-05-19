package recursion;


class SimpleFunctions {
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static boolean isEvenNumber(int number) { // function definition
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printHello() { // function definition
        System.out.println("hello");
        printHello();
    }

    public static void main(String args[]) {
        printHello();
    }
}