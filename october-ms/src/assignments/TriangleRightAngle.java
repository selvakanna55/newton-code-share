package assignments;

public class TriangleRightAngle {
    static void printTriangle() {
        int n = 5;
        for (int i = 0; i < n; i++) { //n
            for (int j = 0; j <= i; j++) { //n
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // n*n -> n^2
}
