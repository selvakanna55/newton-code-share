package recursion;

public class RecursionBase1 {

    public static void f(int num) {
        if (num > 4) {
            return;
        }
        f(num + 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        f(1);
    }

    // 1 2 3 4
    // 4 3 2 1
}
