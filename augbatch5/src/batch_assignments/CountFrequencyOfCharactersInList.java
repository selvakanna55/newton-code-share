package batch_assignments;

import java.util.*;

public class CountFrequencyOfCharactersInList {
    public static void insert(ArrayList<Character> clist, char c) {
        clist.add(c);
    }

    public static void freq(ArrayList<Character> clist, char c) {
        if (clist.contains(c)) {
            System.out.println(Collections.frequency(clist, c));
        } else {
            System.out.println("Not Present");
        }

    }
}
