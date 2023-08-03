package hashing;


import java.util.HashMap;

class HashMapExample {
    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "varun"); // put -> insert
        hm.put(2, "tarun");
        hm.put(3, "ashok");
        System.out.println(hm);
        hm.put(1, "akash"); // put -> insert
        System.out.println(hm);
        // System.out.println(hm.get(1)); // get -> search -> o(1)
        // System.out.println(hm.get(2));
        // System.out.println(hm.containsKey(2));
        // System.out.println(hm.containsKey(31));

        System.out.println(hm.keySet());
        for (int key : hm.keySet()) {
            System.out.println(key);
        }

    }
}