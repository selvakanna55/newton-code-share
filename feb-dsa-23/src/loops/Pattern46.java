package loops;

public class Pattern46 {
    public static void main(String[] args) {
        // input: 4
        // 0 4 8 12
        // 6 10 14 18
        // 12 16 20 24
        // 18 22 26 30

        // input: 3
        // 0 4 8
        // 6 10 14
        // 12 16 20
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i * 6) + (j * 4) + " ");
            }
            System.out.println();
        }

    }
}
