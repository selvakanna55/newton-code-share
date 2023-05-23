package arena;


import java.util.Scanner;
import java.util.TreeSet;

// don't change the name of this class
// you can add inner classes if needed
class UniqueElementsSet {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> li = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            li.add(num);
        }
        for (int num : li) {
            System.out.print(num + " ");
        }

    }
}