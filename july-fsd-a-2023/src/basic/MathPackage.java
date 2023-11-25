package basic;

import java.lang.Math;

public class MathPackage {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 12));
        System.out.println(Math.max(10, Math.max(20, 25)));
        System.out.println(Math.min(10, 12));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.pow(4, 3));
        System.out.println(Math.floor(1.7)); // 1
        System.out.println(Math.ceil(1.7)); // 2
        System.out.println(Math.abs(-10)); // change negative to positive
    }
}
