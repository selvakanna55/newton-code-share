package oops;

import maths.Factorization;

public class TestingPackage {
    public static void main(String[] args) {
        Factorization f1 = new Factorization();
        f1.factorsN(10);
        System.out.println("end");
    }
}