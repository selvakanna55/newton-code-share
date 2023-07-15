package oops.constructor;


public class CallParentClassConstructor {
    public static void main(String args[]) {
        Maruti c1 = new Maruti("hundai", 2021, 4, 2);
        System.out.println(c1.name + " " + c1.year);
        System.out.println(c1.seats + " " + c1.mirros);

    }
}


class Car44 {
    String name;
    int year;

    Car44(String name, int year) {
        this.name = name;
        this.year = year;
    }

}

class Maruti extends Car44 {
    int seats;
    int mirros;

    Maruti(String name, int year, int seats, int mirros) {
        super(name, year);
        this.seats = seats;
        this.mirros = mirros;
    }
}