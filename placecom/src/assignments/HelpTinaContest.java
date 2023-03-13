package assignments;

import java.util.*;

public class HelpTinaContest {

    static class Solve {
        public ArrayList<Integer> solve(int n) {
            HashSet<Integer> uniq = new HashSet<>();
            ArrayList<Integer> res = new ArrayList<>();
            res.add(n);
            uniq.add(n);
            for (int i = n - 1; i >= 1; i--) {
                int last = res.get(res.size() - 1);
                if (last <= i) {
                    res.add(last + i);
                    uniq.add(last + i);
                } else if (last - i > 0 && !uniq.contains(last - i)) {
                    res.add(last - i);
                    uniq.add(last - i);
                } else if (last + i < n && !uniq.contains(last + i)) {
                    res.add(last + i);
                    uniq.add(last + i);
                }
            }
            Collections.reverse(res);
            System.out.println(res + " " + n);
            return res;
        }
    }
}
