package oops.inheritance;

class Mobile {
    int ram;
    int camera;

    Mobile(int ram, int camera) {
        this.ram = ram;
        this.camera = camera;
        System.out.println("mobile is created");
    }

    Mobile() {
        System.out.println("parent - mobile");
    }

    void call() {
        System.out.println("calling from mobile");
    }
}

class AndroidMobile extends Mobile {
    AndroidMobile() {
        ram = 10;
        camera = 10;
        System.out.println("child - AndroidMobile ");
    }

    void call() {
        System.out.println("calling from android phone");
        super.call();
    }
}

public class SuperExample {
    public static void main(String[] args) {
        AndroidMobile mb = new AndroidMobile();
        mb.call();
        Mobile m1 = new Mobile();
    }
}
