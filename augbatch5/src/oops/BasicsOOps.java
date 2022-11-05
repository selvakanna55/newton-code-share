package oops;

import java.util.Scanner;

class Car {

    Car() {
        System.out.println("car is crated");
    }

    Car(String carModel) {
        model = carModel;
    }

    Car(String model, String brand, int carGear) {
        this.model = model;
        this.brand = brand;
        gear = carGear;
    }

    void setBrand(String carBrand) {
        brand = carBrand;
    }

    String getBrand() {
        return brand;
    }

    private String model;
    private String brand;
    int gear;

    void printCarModel() {
        System.out.println(model);
    }

    int getGear() {
        return gear;
    }
}

public class BasicsOOps {
    public static void main(String[] args) {
        // new -> allocates memory in heap
        Scanner sc = new Scanner(System.in);
        // reference = obj
        Car bmw350d = new Car("350d", "BMW", 6);
//        bmw350d.brand = "abcd";
        bmw350d.setBrand("abcd");

        System.out.println(bmw350d.getBrand());
//        main();
//        Car audi1 = new Car();
//        Car audi2 = new Car("audi2");
////        bmw350d.model = "350d";
////        bmw350d.brand = "BMW";
////        bmw350d.gear = 6;
//
////        System.out.println(bmw350d.model);
////        System.out.println(bmw350d.brand);
////        System.out.println(bmw350d.gear);
//        System.out.println(bmw350d.getGear());
//        bmw350d.printCarModel();
    }

//    static void main() {
//        System.out.println("bij");
//    }
}
