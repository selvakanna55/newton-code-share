package batch_assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class TwoBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
//        long ans=1000000000000000L;
//        for(int i=0;i<60;++i){
//            for(int j=i+1;j<60;++j){
//                ans=Math.min(ans,Math.abs(n-((long)1<<i)-((long)1<<j)));
//            }
//        }
//        System.out.println(ans);

        if (n == (long) 1) {
            System.out.println(2);
            return;
        }
        long setBit1 = -1;
        long setBit2 = -1;
        long x = n;
        int i = 0;
        while (x != 0) {
            if ((x & (long) 1) == 1) {
                long temp = setBit1;
                setBit1 = i;
                setBit2 = temp;
            }
            x = x >> 1;
            i++;
        }

        long y = (long) 1 << setBit1;
        if (setBit2 == -1) {
            y = y | (long) 1;
        } else {
            y = y | (long) 1 << setBit2;
        }


        System.out.println(Math.abs(n - y));
    }
}