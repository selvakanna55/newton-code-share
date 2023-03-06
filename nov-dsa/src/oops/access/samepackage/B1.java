package oops.access.samepackage;

public class B1 {
    public static void main(String[] args) {
        A1 obj = new A1();
        System.out.println(obj.publicVal);
        System.out.println(obj.protectedVal);
        System.out.println(obj.defaultVal);
//        System.out.println(obj.privateVal);
    }
}
