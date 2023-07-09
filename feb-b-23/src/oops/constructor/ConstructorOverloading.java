package oops.constructor;


class ConstructorOverloading {
    public static void main(String args[]) {
        // className variableName = new className();
        Car3 car1 = new Car3("BMW");
        Car3 car2 = new Car3("BMW", 2009);
    }
}


class Car3 {
    String company;
    int year;

    Car3(String carCompany) {
        company = carCompany;
        System.out.println("carCompany provided");
    }


    Car3(String carCompany, int madeYear) {
        company = carCompany;
        year = madeYear;
        System.out.println("carCompany, madeYear provided");
    }
}