package functions;

public class Function1 {

    public static void main(String args[]) {
        System.out.println("start");
        addNum();
        greetGuest("Abcd");
        System.out.println("end");
    }

    public static void greetGuest(String name) {
        System.out.println("Hello " + name);
        System.out.println("How are you?");
        System.out.println("Mr." + name + " Do you want or coffe or Tea");
    }

    public static void addNum() {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println(sum);
    }


}
