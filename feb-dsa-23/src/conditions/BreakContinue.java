package conditions;


class BreakContinue {
    public static void main(String args[]) {
        // print divisors of N
        // break; -> switch/ loops
        // continue; -> loops
        //dont print mutiples of 3 -> 3,6,9,..
        int n = 100; // at any point, if you meet mutiple of 8 stop printing  1 2 4 5 7
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue; // skip below lines, and go to next iteration
            }
            if (i % 8 == 0) {
                break; // stop the loop
            }
            System.out.print(i + " ");
        }


        // print 3rd mutiple of 4, from N
        int count = 0; // how many mutiple of 4 i met so far
        for (int i = n; i <= 100000; i++) {
            if (i % 4 == 0) {
                count = count + 1;
            }
            if (count == 3) {
                System.out.println(i);
                break;
            }
        }

    }
}