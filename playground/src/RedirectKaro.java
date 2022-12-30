public class RedirectKaro {
    static boolean f(int[] req, int[] maxReq, int n, int k) {
        int idx = 0;
        int add = Math.min(req[0], maxReq[0]);
        for (int i = 0; i < n; i++) {
            if (req[i] > maxReq[i]) {
                int diff = req[i] - maxReq[i];
                if (idx < i - k) {
                    idx = i - k;
                    add = 0;
                }
                while (diff > 0 && idx < n) {
                    int canAdd = maxReq[idx] - add;
                    int adding = Math.min(diff, canAdd);
                    diff = diff - adding;
                    add = add + adding;
                    if (diff > 0 && add == maxReq[idx]) {
                        idx++;
                        if (idx >= n) return false;
                        add = Math.min(req[idx], maxReq[idx]);
                    }
                    if (idx > i + k) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int req[] = {1, 3, 2, 4};
        int maxReq[] = {2, 1, 5, 3};
        int n = req.length;
        int l = 0, r = n + 1;
        int ans = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = (l + r) / 2;
//            System.out.println(l + " " + r + " " + mid);
            if (f(req, maxReq, n, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
