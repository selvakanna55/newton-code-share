package collection_example;

import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
        //maps -> key value pairs
        //1, "newton"
        //2 , "abhsd"
        //3, "ksdc"
        //3, "selva"
        //(rollNo, name)
        // key is always unique
        //(key, value)
        Map<Integer, String> hm = new TreeMap<>();
        hm.put(10, "Newton");
        hm.put(11, "abcd");
        hm.put(12, "xyz");
        hm.put(13, "mnop");
//        System.out.println(hm);
        hm.put(13, "xyz"); //O(1)
//        System.out.println(hm);
//        //keys -> sets
//        System.out.println(hm.keySet());
//        System.out.println(hm.values());
//        // check if key is present or not
//        System.out.println(hm.containsKey(10)); //O(1)
//        System.out.println(hm.containsKey(41)); //O(1)
//        System.out.println(hm.containsValue("xyz")); //O(n)
//        System.out.println(hm.containsValue("srf")); //O(n)

//        Iterator<Integer> it = ts.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next()+" ");
//        }

        //2 ways,
        // iterator
        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> curr = it.next();
            System.out.println(curr.getKey() + " " + curr.getValue());
        }
        System.out.println("---------");
        //[10, 11, 12, 13]
        //using keys
        for (Integer key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }
    }
}
