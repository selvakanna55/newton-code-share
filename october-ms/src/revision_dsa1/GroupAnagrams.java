package revision_dsa1;


import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            char arr[] = strs[i].toCharArray(); //['e','a','t']
            Arrays.sort(arr); // ['a','e','t']
            String sorted = new String(arr); //aet
            if (!hm.containsKey(sorted)) {
                hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(strs[i]);
        }

        System.out.println(hm);

        List<List<String>> res = new ArrayList<List<String>>();

        for (List<String> l : hm.values()) {
            System.out.println(l);
            res.add(l);
        }
        return res;
    }
}

// 0 0 1 2 1 2  -> 0 0 1 1 2 2
