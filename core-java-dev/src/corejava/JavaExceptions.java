package corejava;

class NewtonException extends Throwable {
    @Override
    public String getMessage() {
        return "NewtonException message";
    }
}

public class JavaExceptions {
    static int div() throws ArithmeticException {
        throw new ArithmeticException();
    }


    public static void main(String[] args) {

        try {
            div();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            int ans = 10 / 0;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
