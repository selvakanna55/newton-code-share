package maths;

public class NumberSys {
    public static void main(String[] args) {
        int num = 76; // octal //8 convert to int

        int res = 0;
        int idx = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            res += Math.pow(8, idx) * lastDigit;
            idx++;
            num = num / 10;
        }
        System.out.println(res);

    }
}
