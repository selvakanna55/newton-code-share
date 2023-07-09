package oops.constructor;


class ConstructorWithParams {
    public static void main(String args[]) {
        // className variableName = new className();
        Car1 car1 = new Car1("BMW");
        System.out.println(car1.company);
    }
}

class Car1 {
    String company;
    int year;

    Car1(String carCompany) {
        company = carCompany;
        System.out.println("car created");
    }
}