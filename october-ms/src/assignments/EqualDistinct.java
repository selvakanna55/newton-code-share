package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class EqualDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> hs = new HashSet<>();
            boolean duplicate = false;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (hs.contains(num)) {
                    duplicate = true;
                }
                hs.add(num);
            }
            if (hs.size() % 2 == 0 || duplicate == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}