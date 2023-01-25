package arraylist;

import java.util.ArrayList;

public class FIndPrimes {
    public static void main(String[] args) {
        int n = 100;
        // how many till 100
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                res.add(i);
            }
        }
        System.out.println(res);
    }
}
