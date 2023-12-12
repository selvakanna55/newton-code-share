package oops;


import maths.GcdLcm;

public class DifferentPackageExample {
    public static void main(String[] args) {

    }
}

class Example1 extends GcdLcm {
    void gcd() {
        System.out.println(gcd(10, 20));
    }
}



