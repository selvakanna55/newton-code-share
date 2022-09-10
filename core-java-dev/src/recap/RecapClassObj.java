package recap;

class CarDemo {
    final String engine = "BS6";
    int noOfSeats;
    int noOfGears;

    static int engineNo = 123456;

    CarDemo(int seats, int gears) {
        this.noOfGears = gears;
        this.noOfSeats = seats;
    }

    public void drive() {
        System.out.println("driving a car");
    }

    void applyBreak() {
        System.out.println("car stopped");
    }
}

// constructor
// this keyword

// access modfifiers
//public private protected default
//static call/access without creating obj to it

public class RecapClassObj {
    volatile int a = 10;

    public static void main(String[] args) {
        CarDemo audi = new CarDemo(6, 4);
        audi.drive();
        audi.applyBreak();
        System.out.println("Audi Engine No: " + audi.engineNo);
        System.out.println(audi.noOfSeats + " " + audi.noOfGears + " " + audi.engineNo);
        audi.engineNo++;
        CarDemo swift = new CarDemo(4, 4);
        System.out.println("Swift Engine No: " + swift.engineNo);
        System.out.println("Audi Engine No: " + swift.engineNo);
        System.out.println(swift.noOfSeats + " " + swift.noOfGears);


    }
}
