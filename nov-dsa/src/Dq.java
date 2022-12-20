import java.util.*;

public class Dq {


    public static void main(String[] args) {
//        Deque<Integer> dq1 = new LinkedList<>();
//        dq1.addFirst(10);
//        dq1.addFirst(20);
//        dq1.addLast(60);
//        dq1.addLast(80);
//        System.out.println(dq1.removeFirst()); // 20
//        System.out.println(dq1.removeLast()); // 80
//
//        HashMap<Integer, Integer> freq = new HashMap<>(); // hashing -> no order -> O(1)
//        TreeMap<Integer, Integer> tm = new TreeMap<>(); // tree -> sorted -> O(logn)
//        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>(); // linkedList -> inserted order -> O(n)
//
//

        int arr[] = {10, 13, 11, 12, 11, 13,}; // 10, 11, 12, 13
        TreeSet<Integer> hs = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);


    }
}
