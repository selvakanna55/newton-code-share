package binary_search;

// https://my.newtonschool.co/playground/code/fy819lrown59

class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 1;
        int left = 1, right = 1000000000;
        while (left <= right) {
            int mid = (left + right) / 2;
            int speed = mid;
            int timeTaken = getTotalHours(piles, speed);
            // System.out.println(speed+" "+timeTaken);
            if (timeTaken <= h) {
                ans = speed;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private int getTotalHours(int[] dist, int speed) {
        int n = dist.length;
        int timeTaken = 0;
        for (int i = 0; i < n; i++) {
            timeTaken += (dist[i] / speed);
            if (dist[i] % speed > 0) {
                timeTaken++;
            }
        }
        return timeTaken;
    }
}


// n^2 -> logn*n

//    for(int i=0;i<piles.length;i++){
//         max = Math.max(max, piles[i]);
//     }