package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class AkashsContestContest {
    static boolean possibleToPrintTime(int x, int y, int time, int n) {
        return (time / x + time / y) >= n - 1;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();
        int low = 0, high = (int) (1e9);
        while (low <= high) {
            int time = low + (high - low) / 2;
            if (possibleToPrintTime(x, y, time, n)) {
                high = time - 1;
            } else {
                low = time + 1;
            }
        }
        System.out.println(low + Math.min(x, y));

        // for(int time=1;time<=(int)(1e9);time++){ // pages
        //     // possible to peint n copies with in time
        //     if(possibleToPrintTime(x, y, time, n)){
        //         System.out.println(time+Math.min(x,y));
        //         break;
        //     }
        // }
    }
}