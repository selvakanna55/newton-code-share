package maths;

public class Divsiblity {
    static void divBy11() {
        String num = "112211";
        int n = num.length();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i); // '7'-'0' -> 7
            int cur = ch - '0'; // 7
            if (i % 2 == 1) {
                oddSum = oddSum + cur;
            } else {
                evenSum = evenSum + cur;
            }
        }
        int diff = oddSum - evenSum;
        if (diff % 11 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

    static void divBy7() {
        System.out.println("dividing 112");
        String num = "85680"; //
        int n = num.length();
        int rem16 = 0;
        int rem7 = 0;
        for (int i = 0; i < n; i++) {
            int curr = num.charAt(i) - '0';
            rem16 = (rem16 * 10 + curr) % 112;
//            rem7 = (rem7 * 10 + curr) % 7;
        }
        if (rem16 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
//        int last = num % 10;
//        num = (num - last) / 10;
//        last = last * 2;
//        num = num - last;
//        if (num % 7 == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }

    static boolean div15(String num) {
        int n = num.length();
        if (!(num.charAt(n - 1) == '0' || num.charAt(n - 1) == '5')) {
            return false;
        }
        int digitSum = 0;
        for (int i = 0; i < n; i++) {
            int curr = num.charAt(i) - '0';
            digitSum = digitSum + curr;
        }
        if (digitSum % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //        "3234567" - "14"
    public static void main(String[] args) {
        divBy7();
//        String num = "10170";
//        System.out.println(div15(num));
//        System.out.println(10170 % 15);
//        // 3 -> sum
        // 5 -> 0, 5

//

        // last dif = 7
        // 7*2 -> 14
        // 35 - 14 -> 21 % 7


    }
}
