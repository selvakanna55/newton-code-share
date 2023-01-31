package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SortCharactersByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                int count = hm.get(ch);
                hm.put(ch, count + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        ArrayList<Character> li = new ArrayList<>();
        li.addAll(hm.keySet());
        // System.out.println(hm);
        // System.out.println(li);
        Collections.sort(li, (a, b) -> {
            if (hm.get(a) == hm.get(b)) {
                if (a < b) return -1;
                else return 1;
            } else {
                return hm.get(b) - hm.get(a);
            }
        });
        for (char ch : li) {
            int freq = hm.get(ch);
            for (int i = 0; i < freq; i++) {
                System.out.print(ch);
            }
        }
    }
}