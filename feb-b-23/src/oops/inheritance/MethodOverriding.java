package oops.inheritance;


public class MethodOverriding {
    public static void main(String args[]) {
        AndroidPhone3 a1 = new AndroidPhone3();
        a1.call();
    }
}

class Phone3 {
    void call() {
        System.out.println("calling a num");
    }
}

class AndroidPhone3 extends Phone3 {
    void call() {
        System.out.println("recording...");
        super.call();
    }
}