package arraylist;


import java.util.ArrayList;
import java.util.Collections;

class SimpleArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>(3); //  int arr[] = new int[3];
        numbers.add(10); //add at the end
        numbers.add(20); //add at end
        System.out.println(numbers);
        numbers.add(1, 22); //insert in between arr[1] = 22;
        System.out.println(numbers);
        numbers.set(0, 40); //arr[0] = 40; updating value
        System.out.println(numbers);
        System.out.println(numbers.get(0)); //arr[0]
        System.out.println(numbers.size()); //arr.length

        int n = numbers.size();
        for (int i = 0; i < n; i++) {
            System.out.println(numbers.get(i)); //arr[i]
        }


        Collections.sort(numbers); // ascending order
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder()); // descending order
        System.out.println(numbers);

    }
}