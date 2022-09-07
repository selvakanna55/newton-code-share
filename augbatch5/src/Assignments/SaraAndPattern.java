package Assignments;

public class SaraAndPattern {
    static void Pattern(int N) {
        for (int i = 0; i < N; i++) {
            int num = i * 6;
            for (int j = 0; j < N; j++) {
                System.out.print(num + (j * 4) + " ");
            }
            System.out.println();
        }
    }
}
