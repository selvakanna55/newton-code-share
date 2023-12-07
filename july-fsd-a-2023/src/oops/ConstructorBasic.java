package oops;


// name of constructor and class name must be same
// constructor gets called automtically when new obeject is created
// cannot return any data
// used to initialzed value, enforce constraints while createing object
public class ConstructorBasic extends Object {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        Student s1 = new Student("Varun", 20);

    }
}

class Student {
    String name;
    int rollNo;
    double percentage;

    Student(String studName, int studRollNo) { // constructor
        super();
        name = studName;
        rollNo = studRollNo;
    }
}