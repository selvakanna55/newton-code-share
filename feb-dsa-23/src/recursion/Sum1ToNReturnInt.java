package recursion;


public class Sum1ToNReturnInt {
    static int sum(int i, int n) {
        if (i > n) return 1;
        int ans = i * sum(i + 1, n);
        return ans;
    }

    public static void main(String[] args) {
        int n = 3; // 1+2+3
        int ans = sum(1, n);
        System.out.println(ans);
    }
}
