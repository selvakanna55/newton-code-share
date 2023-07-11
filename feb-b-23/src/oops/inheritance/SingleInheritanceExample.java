package oops.inheritance;

public class SingleInheritanceExample {

    public static void main(String args[]) {
        AndroidPhone p1 = new AndroidPhone();
        p1.call();
        p1.playCandyCrush();
    }
}


class Phone {
    int buttonCount;

    void call() {
        System.out.println("calling");
    }
}

class AndroidPhone extends Phone {
    int cameraPixel;

    void playCandyCrush() {
        System.out.println("playing candy crush");
    }
}