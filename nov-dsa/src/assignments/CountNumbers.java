package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CountNumbers {
    static boolean isContains345(long n) {
        boolean three = false, four = false, five = false;
        while (n > 0) {
            long lastDigit = n % 10;
            if (lastDigit == 3) {
                three = true;
            } else if (lastDigit == 4) {
                four = true;
            } else if (lastDigit == 5) {
                five = true;
            } else {
                return false;
            }
            n = n / 10;
        }
        return three && four && five;
    }

    static long recusrion(long n, long currNum, boolean three, boolean four, boolean five) {
        if (currNum > n) return 0;
        long ans = 0;
        if (three && four && five) {
            ans++;
        }
        ans += recusrion(n, currNum * 10 + 3, true, four, five);
        ans += recusrion(n, currNum * 10 + 4, three, true, five);
        ans += recusrion(n, currNum * 10 + 5, three, four, true);
        return ans;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(recusrion(n, 0, false, false, false));

        //   for(long i=1;i<=n;i++){
//             if(isContains345(i)){
//                 count++;
//             }
//         }
    }
}

