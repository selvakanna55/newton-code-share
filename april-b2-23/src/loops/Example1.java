package loops;

public class Example1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 5);
        }
        n = 50;
        for (int i = 5; i <= n; i = i + 5) {
            System.out.println(i);
        }
    }
}
