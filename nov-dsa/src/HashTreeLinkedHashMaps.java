import java.util.*;

class HashTreeLinkedHashMaps {
    public static void main(String args[]) {
        // order key
        //  key,           value
        HashMap<Integer, Integer> hm = new HashMap<>(); // no order keys -> hashinhg -> O(1)
        TreeMap<Integer, Integer> tm = new TreeMap<>(); //sorted order keys -> binary tree -> O(logn)
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>(); // inserted order keys  -> linked list -> O(n)


        hm.put(10, 10);
        hm.put(7, 1);
        hm.put(14, 11);
        hm.put(19, 11);
        System.out.println(hm);


        tm.put(10, 10);
        tm.put(7, 1);
        tm.put(14, 11);
        tm.put(19, 11);
        System.out.println(tm);


        lhm.put(10, 10);
        lhm.put(7, 1);
        lhm.put(14, 11);
        lhm.put(19, 11);
        System.out.println(lhm);


    }

}