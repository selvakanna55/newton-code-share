package collections;

import java.util.*;

class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){ //O(n)
            if(hm.containsKey(s.charAt(i))){
                int count = hm.get(s.charAt(i));
                hm.put(s.charAt(i), count+1);
            }else{
                hm.put(s.charAt(i), 1);
            }
        }
        System.out.println(hm);
        for(int i=0;i<n;i++){
            if(hm.get(s.charAt(i))==1){ // non repating
                return i;
            }
        }
        return -1;
    }
}