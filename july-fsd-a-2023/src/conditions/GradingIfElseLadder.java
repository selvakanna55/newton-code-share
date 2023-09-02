package conditions;

public class GradingIfElseLadder {

    public static void main(String args[]) {
        System.out.println("begin");
        int mark = 68;
        if (mark > 80) {
            System.out.println("A");
        } else if (mark > 70) {
            System.out.println("B");
        } else if (mark > 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        System.out.println("end");
    }
}