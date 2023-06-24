package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class QuestionOfTheDayFavoriteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextInt();
        long y = scanner.nextInt();

        HashSet<Long> s = new HashSet<>();
        s.add(x);
        while (x < y) {
            if (x % 2 == 1) {
                x--;
            } else {
                x = (3 * x) / 2;
            }
            if (s.contains(x)) break;
            s.add(x);
        }

        if (x >= y) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }


}