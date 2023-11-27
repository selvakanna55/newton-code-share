package maths;


import java.util.ArrayList;

public class PrimeFactorization {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<String>();
        li.add("");
        int idx = 0;
        while (li.size() <= 25) {
            String curr = li.get(idx);
            li.add(curr + '2');
            li.add(curr + '3');
            li.add(curr + '5');
            li.add(curr + '7');
            idx++;
        }
    }
}