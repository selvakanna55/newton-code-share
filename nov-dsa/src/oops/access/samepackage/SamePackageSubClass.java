package oops.access.samepackage;

public class SamePackageSubClass extends A1 {
    void print() {
        System.out.println(publicVal);
        System.out.println(protectedVal);
        System.out.println(defaultVal);
//        System.out.println(privateVal);
    }
}
