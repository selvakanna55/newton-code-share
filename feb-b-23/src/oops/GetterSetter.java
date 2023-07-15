package oops;


public class GetterSetter {
    public static void main(String args[]) {
        Car23 c1 = new Car23();
        c1.print();

        System.out.println(c1.num + " " + c1.seats + " " + c1.mirror); //outside class
        //c1.wheels -> private is not accessible
        System.out.println(c1.getWheels());
        c1.setWheels(20);
        System.out.println(c1.getWheels());
    }
}


class Car23 {
    int num = 1; //deault
    private int wheels = 2;
    public int seats = 3;
    protected int mirror = 4;

    public void print() { //same class
        System.out.println(num + " " + wheels + " " + seats + " " + mirror);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

}
// static -> can be called without creating object