package time_space;

public class SumOfN {
    public static void main(String[] args) { //O(n)
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) { // n
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println(((n * (n + 1)) / 2));  // 1
        System.out.println();
    }
}
