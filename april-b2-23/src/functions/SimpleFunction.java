package functions;

public class SimpleFunction {
    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void receptionist(String name) {
        System.out.println("hai! " + name);
        System.out.println("how may i assist you?");
    }

    public static void addTwoNumber(int a, int b) {
        System.out.println(a + b);
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("begin");
//        String personName = "tarun";
//        receptionist(personName);
        int sum = add(15, 20);
        System.out.println(sum);
        System.out.println("end");
    }
}
