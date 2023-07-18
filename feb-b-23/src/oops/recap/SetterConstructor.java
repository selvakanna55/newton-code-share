package oops.recap;


public class SetterConstructor {
    public static void main(String args[]) {
        // String name = "newton";
        // String name1 = new String("newton");
        // printNameInUpperCase(name);
        // printNameInUpperCase(name1);
        Student s1 = new Student("ashok");
        s1.name = "raja";
        s1.setName("duruva");
        printNameInUpperCase(s1);

    }

    static void printNameInUpperCase(Student stud) {
        System.out.println(stud.getName());
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}