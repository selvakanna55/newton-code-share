package recursion;

public class FunctionWorking {
    public static int addTwoNumber(int a, int b) {
        System.out.println("function called");
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = addTwoNumber(a, b);
        System.out.println(sum);
    }
}
