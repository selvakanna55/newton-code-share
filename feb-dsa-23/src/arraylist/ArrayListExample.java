package arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); //dynamic
        list.add(10); //list[0] = 10; next available index
        list.add(20); //average -> O(1) -, worst
        list.add(90);
        list.add(50);
        list.add(60);
        list.add(1, 40); //list[1] = 40; // insert at index, inbetwen
        list.set(2, 30); //list[2] = 30; // update/modify
        list.remove(1); //
//        System.out.println(list.get(1)); //list[1] get the value at index 1
//        System.out.println(list.size()); //list.length
        System.out.println(list);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");//arr[i]
        }
        System.out.println();
        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf(99));

    }
}
