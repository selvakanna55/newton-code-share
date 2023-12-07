package oops;


public class InheritanceWithSuper {
    public static void main(String[] args) {
        IPhone maxPro = new IPhone();
        maxPro.call("11223344");
    }
}

class Phone {
    void call(String num) {
        System.out.println("calling to a number....." + num);
    }
}

class IPhone extends Phone {
    void call(String num) {
        System.out.println("storing data in apple " + num);
        super.call(num);
    }
}