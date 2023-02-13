package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MostOccurringElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> li = new ArrayList<>(hm.keySet());
        // System.out.println(li);

        Collections.sort(li, (a, b) -> {
            // function >0 swap
            if (hm.get(a) == hm.get(b)) {
                return a - b;
            } else {
                return hm.get(b) - hm.get(a);
            }
        });

        for (int i = 0; i < 3; i++) {
            if (i < li.size()) {
                System.out.print(li.get(i) + " ");
            } else {
                System.out.print("-1 ");
            }
        }


    }
}
