package assignments;


// https://my.newtonschool.co/playground/code/0fn3d5tseakz/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LoneSumSupremacyContest {
    static long digitSum(String num) {
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int curr = num.charAt(i) - '0'; // '1' -> 1
            sum += curr;
        }
        return sum;
    }
    //""+10 -> "10"


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String num = sc.next();
            long sum = digitSum(num); //123456
            while (sum > 9) {
                num = String.valueOf(sum);
                sum = digitSum(num);
            }
            arr[(int) sum]++;
        }

        for (int i = 1; i < 10; i++)
            System.out.print(arr[i] + " ");
    }
}