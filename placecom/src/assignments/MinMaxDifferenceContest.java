package assignments;

// https://my.newtonschool.co/playground/code/99s7pmq44vbh/
class MinMaxDifferenceContest {
    public int smallestRangeI(int[] A, int K) {
        // enter your code here
        int mini = A[0];
        int maxi = A[0];
        for (int num : A) {
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        }
        int ans = (maxi - K) - (mini + K);
        if (ans < 0) return 0;
        return ans;
    }
}