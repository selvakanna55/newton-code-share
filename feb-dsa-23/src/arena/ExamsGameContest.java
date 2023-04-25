package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ExamsGameContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int t = 0; t < testcase; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num = Math.abs(a - b);

            int count = 0;
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    if (i == num / i) { // is it is perfect square then print only i
                        count = count + 1;
                        //    System.out.println(i);
                    } else {
                        count = count + 2;
                        //  System.out.println(i+" "+num/i);
                    }
                }
            }
            System.out.println(count);
        }
    }
}
