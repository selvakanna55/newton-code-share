import java.util.Scanner;

class NewtonException extends Throwable {
    public String getMessage() {
        return "this is special exception in newton school";
    }
}

//throw -> throw an exception
// throws -> throws is used in function signature,
//          to inform to user that this function is going to
//          throw an exception

class Calc {
    static void div(int a, int b) throws NewtonException {
        System.out.println(a / b);
        throw new NewtonException();
    }
}

public class JavaExceptions {
    public static void main(String[] args) {
        System.out.println("begins");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            Calc.div(a, b);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("im from final");
        }
//        try {
//            System.out.println("hi im inside try");
//            System.out.println(a / b);
//            System.out.println("hi im end try");
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
        System.out.println("end");
    }
}
