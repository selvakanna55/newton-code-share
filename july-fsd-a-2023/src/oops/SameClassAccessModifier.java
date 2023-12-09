package oops;

// https://media.geeksforgeeks.org/wp-content/cdn-uploads/Access-Modifiers-in-Java.png
public class SameClassAccessModifier {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.name = "raj";
        // s1.rollNo = 10; // private cannot be accessed outside the class
        s1.age = 99;
        s1.mark = 77;
    }
}


class Student3 {
    public String name; // anyone
    private int rollNo; // only with in the class
    protected int age; // only with in class, children class
    int mark; // with in folder
}

