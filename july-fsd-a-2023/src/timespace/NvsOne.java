package timespace;

public class NvsOne {
    public static void main(String[] args) {
        int n = 5;
        System.out.println((n * (n + 1)) / 2); // O(1)

        int sum = 0;
        for (int i = 1; i <= n; i++) { // O(n)
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
