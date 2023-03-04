package functions;

public class FunctionDoubt {
    public static void addTwoNumber() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }

    public static int addNum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("begin");
        int sumOfTwoNumber = addNum(10, 20);
        System.out.println(sumOfTwoNumber);
        System.out.println("end");
    }
}
