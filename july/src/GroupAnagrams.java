import java.util.*;

//["eat","tea","tan","ate","nat","bat"]
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i]; //"eat"
            char arr[] = str.toCharArray(); //['e', 'a', 't']
//             char arr[] = new char[26];

//             for(int j=0;j<str.length();j++){
//                 arr[str.charAt(j)-'a']++;
//             }

            Arrays.sort(arr); // ['a', 'e', 't']
            String sorted = new String(arr); //aet
            System.out.println(sorted);
            if (!hm.containsKey(sorted)) {
                hm.put(sorted, new ArrayList<String>());
            }
            hm.get(sorted).add(str);
        }
        // System.out.println(hm);
        List<List<String>> res = new ArrayList<List<String>>();

        for (List<String> list : hm.values()) {
            res.add(list);
        }
        return res;
    }
}