package recursion;

public class Print1ToN {

    static void print1toNRec(int num, int n) {
        if (num > n) {
            return;
        }
        System.out.print(num + " ");
        print1toNRec(num + 1, n);
    }

    public static void main(String[] args) {
        print1toNRec(1, 5);

    }
}
