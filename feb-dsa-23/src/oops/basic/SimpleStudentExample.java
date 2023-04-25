package oops.basic;


class Student {
    String name;
    int rollNo;
    boolean bookIssued;
    int yearOfAdmission;

    Student() {
        System.out.println("student is created");
        System.out.println("student is ok");
        yearOfAdmission = 2023;
        bookIssued = true;
    }

    void writeExam() {
        System.out.println("writing exam");
    }
}


class SimpleStudentExample {
    public static void main(String args[]) {
        Student stud1 = new Student();
        System.out.println(stud1.name); //varun
        System.out.println(stud1.rollNo); //varun
        System.out.println(stud1.yearOfAdmission); //varun
    }
}