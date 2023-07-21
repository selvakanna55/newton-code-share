package leetcode;

import java.util.*;

// https://leetcode.com/problems/pascals-triangle/description/
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
                }
            }
            result.add(row);
        }
        return result;
    }
}