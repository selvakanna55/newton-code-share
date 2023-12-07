package oops;


public class StaticAndThis {
    public static void main(String[] args) {
        Student1 s1 = new Student1(10, 20);
        Student1 s2 = new Student1(10, 20);
        System.out.println(s1.age + " " + s1.mark);
        System.out.println(s2.age + " " + s2.mark);
    }
}

class Student1 {
    static int age;
    int mark;

    Student1(int age, int mark) { // constructor name must be same as class
        this.age = age;
        this.mark = mark;
    }

    static void writeExam() {
        System.out.println("Student is writing exam");
    }
}