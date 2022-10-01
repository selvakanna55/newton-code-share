package batch_assignments;

import java.util.ArrayList;

public class ThreeWayPartition {

    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal) {

        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) < lowVal) {
                li.add(A.get(i));
                A.set(i, -1);
            }
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != -1 && A.get(i) >= lowVal && A.get(i) <= highVal) {
                li.add(A.get(i));
                A.set(i, -1);
            }
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != -1 && A.get(i) > highVal) {
                li.add(A.get(i));
                A.set(i, -1);
            }
        }

        return li;
    }

}
