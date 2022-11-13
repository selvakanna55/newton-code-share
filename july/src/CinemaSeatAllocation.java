//public class  {
//}


import java.util.*;

class CinemaSeatAllocation {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        for (int seat[] : reservedSeats) {
            if (!hm.containsKey(seat[0])) hm.put(seat[0], new HashSet<>());
            hm.get(seat[0]).add(seat[1]);
        }
        System.out.println(hm);
        int ans = (n - hm.size()) * 2;
        for (int i : hm.keySet()) {
            HashSet<Integer> hs = hm.get(i);
            if (isRangeIsFree(hs, 2, 9)) ans += 2;
            else if (isRangeIsFree(hs, 2, 5)) ans++;
            else if (isRangeIsFree(hs, 4, 7)) ans++;
            else if (isRangeIsFree(hs, 6, 9)) ans++;
        }
        return ans;

    }

    boolean isRangeIsFree(HashSet<Integer> hs, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (hs.contains(i)) return false;
        }
        return true;
    }
}


//empty -> 2
// 2, 9 -> 2
//(2,5) or 4, 7  or 6,9