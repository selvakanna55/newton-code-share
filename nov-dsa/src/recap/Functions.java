package recap;

public class Functions {
    // define function
    // public static returntype functionname () {
    // content of funnction
    // }
    // arguments/parameters


    public static int addTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("begin");
        int num1 = 10;
        int num2 = 20;
        int sum = addTwoNumbers(num1, num2);
        System.out.println(sum);
        System.out.println("end");
    }

//
//public static void printHello12() {
//    System.out.println("hello");
//}
//    public static void addTwoNumber(int a, int b) {
//        int sum = a + b;
//        System.out.println(sum);
//    }
//
//    public static void mulTwoNumber(int a, int b) {
//        int sum = a * b;
//        System.out.println(sum);
//    }

}
