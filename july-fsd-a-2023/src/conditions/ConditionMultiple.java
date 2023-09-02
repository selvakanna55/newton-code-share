package conditions;

public class ConditionMultiple {
    public static void main(String[] args) {
        int number = 22;
        //  divisible by 5 or divisible by 3
        // number%5==0  or number%3==0
        if (number % 5 == 0 || number % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        //  divisible by 5 and divisible by 3 and divisible by 2
        // number%5==0   and number%3==0
        if (number % 5 == 0 && number % 3 == 0 && number % 2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
