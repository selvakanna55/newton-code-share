package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SwappingMatrixContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int num = sc.nextInt();
                if (num == 1) {
                    ans = Math.abs(3 - i) + Math.abs(j - 3);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
