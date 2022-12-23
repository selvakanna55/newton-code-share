package assignments;

import java.util.ArrayList;

public class CountFrequencyOfCharactersInList {

    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c) {
        clist.add(c);
        // Your code here
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> list, char c) {
        int n = list.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == c) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not Present");
        } else {
            System.out.println(count + " ");
        }
        // Your code here
    }
}