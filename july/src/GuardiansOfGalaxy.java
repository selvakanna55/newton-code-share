

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GuardiansOfGalaxy {
    static boolean isPossibleWithEngergy(int arr[], long energy) {
        for (int i = 0; i < arr.length; i++) {
            if (energy >= arr[i]) {
                energy = energy + (energy - arr[i]);
            } else {
                energy = energy - (arr[i] - energy);
            }
            if (energy > 10000000000L) return true;
            if (energy < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long ans = 0;

        //  for(long i=1;i<100000000000L;i++){
        //     boolean res = isPossibleWithEngergy(arr, i);
        //      if(res){
        //          ans = i;
        //          break;
        //      }
        //  }
        long l = 0, r = 100000000000L;
        while (l <= r) {
            long mid = (l + r) / 2;
            boolean res = isPossibleWithEngergy(arr, mid);
            if (res) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        System.out.println(ans);

    }
}