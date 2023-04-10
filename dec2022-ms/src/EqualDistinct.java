import java.util.HashSet;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class EqualDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> hs = new HashSet<>();
            boolean repeating = false;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (hs.contains(num)) {
                    repeating = true;
                }
                hs.add(num);
            }

            if (hs.size() % 2 == 0) {
                System.out.println("YES");
            } else {
                if (repeating) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }


    }
}