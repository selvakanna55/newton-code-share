package oops;


class Student1 {
    int rollNo;
    String name;
    double percentage;

    Student1(String studName, int studRollNo, double studPercentage) {
        System.out.println("hello new Student");
        name = studName;
        rollNo = studRollNo;
        percentage = studPercentage;
    }
}

// javac Main.java -> compile
// java Main -> runtime

public class ConstructorsInJava {
    public static void main(String[] args) {
        double arr[] = new double[10];
        Student1 st1 = new Student1("varun", 1, 99.9); // object
//        Student1 st2 = new Student1("Aditya", 2, 92.1); // object
//        Student1 st3 = new Student1("Ram", 3, 78.9); // object
        System.out.println(st1.name);
        System.out.println(st1.percentage);
        System.out.println(st1.rollNo);
    }
}
