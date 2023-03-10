package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

// class Compare implements Comparator<Integer>
class StrengthOfNumbersContest {
    public static int getStregth(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer a[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, (x, y) -> {
            int sum1 = getStregth(x);
            int sum2 = getStregth(y);
            if (sum1 == sum2) {
                if (x < y) return -1;
                else return 1;
            } else if (sum1 < sum2) return -1;
            else return 1;
        });

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}