package conditions;

public class IsDivisibleBySix {
    public static void main(String args[]) {
        int number = 37;
        if (number % 6 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}