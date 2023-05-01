package loops;

public class SimpleNestedFor {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print("hi ");
            }
            System.out.println();
        }
    }
}
