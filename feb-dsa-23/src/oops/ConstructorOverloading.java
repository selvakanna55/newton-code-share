package oops;


class Student1 {
    int rollNo;
    String name;
    char gender;
    int percentage;

    Student1() {
        System.out.println("empty constructor - Student is created");
    }

    Student1(String name) {
        this.name = name;
        System.out.println("2 parameter constructor - Student is created");
    }

    Student1(String name, char studGender) {
        this.name = name;
        this.gender = studGender;
        System.out.println(name + " " + gender);
        System.out.println("2 parameter constructor - Student is created");
    }
}

class ConstructorOverloading {
    public static void main(String args[]) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Varun", 'M');
    }
}