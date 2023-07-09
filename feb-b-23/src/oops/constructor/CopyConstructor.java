package oops.constructor;


class CopyConstructor {
    public static void main(String args[]) {
        // className variableName = new className();
        Car4 car2 = new Car4("BMW", 2009);
        Car4 car3 = new Car4(car2);
        System.out.println(car2.company + " " + car2.year);
        System.out.println(car3.company + " " + car3.year);
    }
}


class Car4 {
    String company;
    int year;

    Car4(String carCompany) {
        company = carCompany;
        System.out.println("carCompany provided");
    }

    Car4(Car4 obj) {
        company = obj.company;
        year = obj.year;
        System.out.println("copy constructor provided");
    }

    Car4(String carCompany, int madeYear) {
        company = carCompany;
        year = madeYear;
        System.out.println("carCompany, madeYear provided");
    }
}