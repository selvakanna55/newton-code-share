package hashing;


import java.util.HashMap;

class BasicHashMap {
    public static void main(String args[]) {
        // //      key       value
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // hm.put(10,44);
        // hm.put(12,65);
        // hm.put(18,22);
        // hm.put(19,99);

        // // System.out.println(hm);
        // // System.out.println(hm.get(18));
        // // hm.put(18,98);
        // // System.out.println(hm.get(18));
        // // System.out.println(hm.keySet());

        // for(int num:hm.keySet()){
        //     System.out.println(num+" "+hm.get(num));
        // }


        //int -> Integer
        // double -> Double
        //char -> Character


        int arr[] = {1, 2, 3, 4, 1, 2, 1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int count = hm.get(arr[i]);
                hm.put(arr[i], count + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
    }
}

// table

// KEY			VALUE
// rollNo		marks
// 10 			44
// 12			65
// 18			22
// 19			99