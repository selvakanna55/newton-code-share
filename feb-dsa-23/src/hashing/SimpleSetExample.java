package hashing;


import java.util.*;

class SimpleSetExample {
    public static void main(String args[]) {
        // ArrayList<Integer> li = new ArrayList<>();
        TreeSet<Integer> li = new TreeSet<>();
        li.add(10);
        li.add(20);
        li.add(30);
        System.out.println(li);
        li.add(20); // duplicate ignored in set
        System.out.println(li);
        for (int num : li) {
            System.out.print(num + " ");
        }
    }
}


//  int arr[] = {10, 12, 14, 16, 18};

// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+" ");
// }

// System.out.println();

// for(int a: arr){
//     System.out.print(a+" ");
// }