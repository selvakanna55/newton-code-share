package conditions;

public class Conditions1 {
    public static void main(String[] args) {
        // simple If
        int num1 = 10;
        if (num1 % 2 == 0) {
            System.out.println("Even");
        }

        //If else
        int num2 = 10;
        if (num2 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // if elseif elseif else - if else ladder
        int n = 1; // 1 2 3 4 ->
        if (n == 1) {
            System.out.println("ONE");
        } else if (n == 2) {
            System.out.println("TWO");
        } else if (n == 3) {
            System.out.println("THREE");
        } else {
            System.out.println("FOUR");
        }

    }
}
