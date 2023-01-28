package revision_dsa1;


class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int arr[] = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}