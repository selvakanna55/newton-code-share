package contest2;

public class FindSmallestNthNonNegative {
    public static void main(String[] args) {
        // find Nth smallest non negative number that is divisible by N
        // input = 5, output = 20.
        // why ? 0,5,10,15,20
        // input: 6, output: 30
        // 0,6,12,18,24,30
        // input: 9 output: 72
        // 0,9,18,27,36,45,54,63,72
        int n = 8;
        System.out.println(n * (n - 1));


    }
}
