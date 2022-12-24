package oops;

class Student3 {
    int rollNo;
    String name;
    double percentage;

    Student3() {
        System.out.println("student is created");
    }

    Student3(int studRollNo, String studName, double studPercentage) {
        rollNo = studRollNo;
        name = studName;
        percentage = studPercentage;
    }

    Student3(int studRollNo, String studName) {
        rollNo = studRollNo;
        name = studName;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3(10, "ajay", 99.8);
        Student3 s3 = new Student3(10, "sachin");
    }
}
