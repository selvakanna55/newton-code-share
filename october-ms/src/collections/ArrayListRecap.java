package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListRecap {
    public static void main(String[] args) {
        // int -> Integer
        // double Double
        // long Long
        // float Float
        // every oops, call by refe
        ArrayList<Double> list = new ArrayList<>();
        list.add(10.0); // add element at the end of the array
        list.add(20.8);
        list.add(30.0);

//        int n = list.size(); // arr.length
//        for (int i = 0; i < n; i++) {
//            System.out.println(list.get(i)); // arr[i]
//        }
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for (Double num : list) {
            System.out.print(num + " ");
        }
    }
}
