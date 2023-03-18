package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            ts.add(num);
        }
        // System.out.println(ts);
        for (int num : ts) {
            System.out.print(num + " ");
        }

    }
}


// uniq -> set
//sorted -> TreeSet