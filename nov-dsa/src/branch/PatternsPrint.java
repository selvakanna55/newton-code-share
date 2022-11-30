package branch;

public class PatternsPrint {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int rows = 2;
        int cols = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int sum = add(10, 20);
    }
}

/*
 *****
 *****
 *****
 *****
 */
