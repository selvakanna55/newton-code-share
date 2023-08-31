package conditions;

public class IfEleseIf {
    public static void main(String args[]) {
        int number = 123;
        if (number > 100) {
            System.out.println("Bigger");
        } else if (number < 100) {
            System.out.println("Smaller");
        } else {
            System.out.println("Same");
        }
    }
}

// number is bigger than 100-> bigger
// number is less than 100 -> smaller