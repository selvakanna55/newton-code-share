package conditions;

public class Ternary {
    public static void main(String[] args) {   // print biggest among 2
        int a = 55;
        int b = 88;
        int c = 111;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        System.out.println((a > b) ? a : b); // ternary operator
        //              (condition)? true:false


        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        System.out.println((a > b && a > c) ? a : (b > a && b > c) ? b : c); // ternary operator


    }
}
