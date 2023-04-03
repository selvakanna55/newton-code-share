
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int chess1 = 0;
        for (int i = 0; i < n; i++) {
            String line[] = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                int input = Integer.parseInt(line[j]);
                int expected = (i + j) % 2;
                if (input == expected) {
                    chess1++;
                }
            }
        }
        int chess2 = (n * n) - chess1;
        System.out.println(Math.min(chess1, chess2));
    }
}