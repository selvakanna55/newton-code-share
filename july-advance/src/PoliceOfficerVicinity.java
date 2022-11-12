

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PoliceOfficerVicinity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int north = sc.nextInt();
        int east = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int barriers = sc.nextInt();

        int u = north;
        int r = east;
        int l = 1;
        int d = 1;
        while (barriers-- > 0) {
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if (x1 == x2) {
                if (y1 <= y2) {
                    u = y2 - 1;
                } else d = y2 + 1;
            } else if (y1 == y2) {
                if (x1 <= x2) {
                    r = x2 - 1;
                } else l = x2 + 1;
            }
        }

        int total = u + r - l - d;
        System.out.println(total);


    }
}