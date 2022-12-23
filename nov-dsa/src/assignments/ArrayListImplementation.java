package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            li.add(num);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(li.get(i) + " ");
        }
    }
}