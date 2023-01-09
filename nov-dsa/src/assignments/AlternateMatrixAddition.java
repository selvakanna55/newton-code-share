package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AlternateMatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int blackSum = 0;
        int whiteSum = 0;
        for (int i = 0; i < n; i++) {
            String nums[] = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                int val = Integer.parseInt(nums[j]);
                if ((i + j) % 2 == 0) {
                    blackSum = blackSum + val;
                } else {
                    whiteSum = whiteSum + val;
                }
            }
        }
        System.out.println(blackSum);
        System.out.println(whiteSum);
    }
}