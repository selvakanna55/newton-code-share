package loops;

public class SimpleNestedFor {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println("hi");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print("* ");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print("* ");
        }
    }
}
