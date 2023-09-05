package loop;

public class ForWhileCount123 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i = i + 1) {
            System.out.println(i * 4);
        }

        int i = 1;
        while (i <= n) {
            System.out.println(i * 4);
            i = i + 1;
        }

    }
}
