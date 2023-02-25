package conditions;

public class LogicalOrAndNot {
    public static void main(String[] args) {
        // is multiple 3,5
        int n = 3;
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("YES");
        } else if (n % 5 == 0 && n % 10 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
