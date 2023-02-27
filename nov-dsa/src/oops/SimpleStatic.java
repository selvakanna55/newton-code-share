package oops;

class Store {
    static int number = 10;
    String name;
}

public class SimpleStatic {
    public static void main(String[] args) {
        Store.number = 19;  
        System.out.println(Store.number);
//        System.out.println(s1.name+" "+s1.number);
//        System.out.println(s2.name+" "+s2.number);
//        System.out.println(s3.name+" "+s3.number);
    }
}
