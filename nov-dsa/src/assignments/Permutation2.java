package assignments;


import java.util.*;

public class Permutation2 {
    static TreeSet<String> ts = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getPermutations(str.toCharArray(), 0, str.length());
        for (String perm : ts) {
            System.out.print(perm + " ");
        }
    }

    static void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void getPermutations(char arr[], int start, int n) {
        if (start == n - 1) {
            ts.add(new String(arr));
            return;
        }
        for (int i = start; i < n; i++) {
            swap(arr, start, i);
            getPermutations(arr, start + 1, n);
            swap(arr, start, i);
        }
    }
}