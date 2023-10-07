package arraylist;

import java.util.*;

class SimpleArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // insert at the end of the array list
        list.add(20);
        list.add(30);

        System.out.println(list);
        list.set(1, 75); // arr[1] = 75; -> change value of a particular index
        System.out.println(list);

        list.add(2, 49); // insert 49 at index number 2 -> insert 49 between 20 and 30
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { // arr.length -> list.size();
            System.out.println(list.get(i)); // arr[i] -> list.get(i);
        }

    }
}