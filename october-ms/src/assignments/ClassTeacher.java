package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed

class Teacher {
    String name;
    int age;
    private int salary;

    Teacher(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary:  " + salary);
    }
}

class ClassTeacher {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Teacher mod = new Teacher(scan.next(), scan.nextInt(), scan.nextInt());
        mod.details();
    }
}