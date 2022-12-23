package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ABStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();

        int count = 0;
        boolean metB = false;
        for (int i = n - 1; i >= 0; i--) {
            if (word.charAt(i) == 'B') {
                count++;
                metB = true;
            } else {
                if (count == 0) {
                    if (metB == false) {
                        break;
                    }
                } else {
                    count--;
                }
            }
        }
        if (count != 0 || metB == false) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}