package assignments;


import java.util.ArrayList;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class OddSumArrayContest {
    static boolean isSorted(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        if (isSorted(odd) && isSorted(even)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
