package recap;

public class Conditions {
    public static void main(String[] args) {
        // maximum num of 3 numbers
        int a = 10;
        int b = 40;
        int c = 25;
        // maxi?
        // 10>40 && 10>25
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
