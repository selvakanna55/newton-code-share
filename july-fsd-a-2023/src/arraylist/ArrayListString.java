package arraylist;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("hai"); // insert at the end of the array list
        list.add("hello");
        list.add("testing");
        System.out.println(list);

        list.add(2, "EATING"); // BETWEEN hello & testing;
        System.out.println(list);

        list.set(1, "haven"); // change hello to haven
        System.out.println(list);
    }
}
