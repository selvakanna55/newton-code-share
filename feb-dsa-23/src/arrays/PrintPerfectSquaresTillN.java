package arrays;


import java.util.*;

class PrintPerfectSquaresTillN {
    public static void main(String args[]) {
        int n = 22;
        ArrayList<Integer> li = new ArrayList<>();
        // add 1 to 50
        for (int i = 1; i * i <= n; i++) {
            li.add(i * i);
        }
        System.out.println(li);
    }
}