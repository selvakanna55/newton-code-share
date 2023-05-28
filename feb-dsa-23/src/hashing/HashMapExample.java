package hashing;


import java.util.HashMap;

class HashMapExample {
    public static void main(String args[]) {
        // ArrayList<Integer> li = new ArrayList<>(); example
        HashMap<Integer, String> studnetInfo = new HashMap<>();
        studnetInfo.put(10, "varun"); // make an entry
        studnetInfo.put(12, "tarun");
        studnetInfo.put(14, "ajay");
        studnetInfo.put(22, "kumar");
        // System.out.println(studnetInfo);
        // System.out.println(studnetInfo.get(10)); //
        // studnetInfo.put(10, "aakash");
        // System.out.println(studnetInfo.get(10));
        // System.out.println(studnetInfo.containsKey(12)); //
        // System.out.println(studnetInfo.containsKey(32)); //


        System.out.println(studnetInfo.keySet()); // gives keys
        System.out.println(studnetInfo.values()); // gives keys

        for (int rollNo : studnetInfo.keySet()) { // iterate keyset
            System.out.println(rollNo + " " + studnetInfo.get(rollNo));
        }


    }
}