package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Contest404 {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long count404 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 404) {
                count404++;
            }
        }
        sc.close();

        //count 40 and 4
        long count40and4 = 0;
        long c40 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 40) c40++;
            else if (arr[i] == 4) count40and4 += c40;
        }

        // count 4 0 4
        long count4Zero4 = 0;
        long c4 = 0;
        c40 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 4) {
                count4Zero4 += c40;
                c4++;
            } else if (arr[i] == 0) {
                c40 = c40 + c4;
            }
        }

        System.out.println(count404 + count40and4 + count4Zero4);
    }
}