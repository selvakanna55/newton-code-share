package assignments;

import java.util.ArrayList;

public class ThreeWayPartitioning {
    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal) {
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        ArrayList<Integer> inRange = new ArrayList<>();
        int n = A.size();
        for (int i = 0; i < n; i++) {
            if (A.get(i) < lowVal) {
                smaller.add(A.get(i));
            } else if (A.get(i) > highVal) {
                larger.add(A.get(i));
            } else {
                inRange.add(A.get(i));
            }
        }
        smaller.addAll(inRange);
        smaller.addAll(larger);

        return smaller;
    }
}