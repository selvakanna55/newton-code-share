package oops.basic;


class Car {
    String name;
    int year;
    int petrolCapcaity;

    Car(String carName, int carMadeYear, int carPetrolCapcaity) {
        year = carMadeYear;
        name = carName;
        petrolCapcaity = carPetrolCapcaity;
    }

}


class SimpleCarExample {
    public static void main(String args[]) {
        Car xyz = new Car("swift", 2021, 40); // object creation
        System.out.println(xyz.name); //printing result
        System.out.println(xyz.year);
        System.out.println(xyz.petrolCapcaity);
    }
}


// Scanner sc = new Scanner(System.in);
// String carName = sc.next();
// int year = sc.nextInt();