package recursion;

public class ConvertForToRecursion {


    public static void printHi(int i, int n) {
        if (i >= n) {
            return;
        } //i<n -> i>=n
        System.out.println("hi");
        i++;
        printHi(i, n); //next iteration
    }

    public static void main(String[] args) {
        int n = 3;
//        for (int i = 0; i <= n; i++) {
//            System.out.println("hi");
//        }
        printHi(0, n);
    }
}