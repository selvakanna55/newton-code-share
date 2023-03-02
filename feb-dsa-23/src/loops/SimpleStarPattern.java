package loops;

public class SimpleStarPattern {
    public static void main(String[] args) {
        int n = 4;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println(count);
    }
}
