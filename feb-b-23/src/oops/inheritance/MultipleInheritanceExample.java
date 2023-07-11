package oops.inheritance;

public class MultipleInheritanceExample {

    public static void main(String args[]) {
        AndroidPhone p1 = new AndroidPhone();
        p1.call();
        p1.playCandyCrush();
    }
}


class Phone10 {
    int buttonCount;

    void call() {
        System.out.println("calling");
    }
}

class AndroidPhone10 extends Phone10 {

    void playCandyCrush() {
        System.out.println("playing candy crush");
    }
}

class Iphone10 extends Phone10 {
    void playItunes() {
        System.out.println("playing itunes");
    }
}