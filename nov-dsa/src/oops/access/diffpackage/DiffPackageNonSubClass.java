package oops.access.diffpackage;

import oops.access.samepackage.A1;

public class DiffPackageNonSubClass extends A1 {
    void print() {
        System.out.println(publicVal);
        System.out.println(protectedVal);
//        System.out.println(defaultVal);
//        System.out.println(privateVal);
    }
}
