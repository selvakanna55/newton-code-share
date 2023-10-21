package strings;


class SumTillNV2 {
    public static int sum1ToN(int i, int n) {
        int sum = 0;
        if (i <= n) {
            sum = i + sum1ToN(i + 1, n);
        }
        return sum;
    }

    public static void main(String args[]) {

        int sum = 0;
        int n = 3;
        System.out.println(sum1ToN(1, n));
        // 1+2+3 = 6
    }
}