package assignments;

public class ClassesObjectsManipulation {
    static class Student {
        String name;
        int rollNumber;

        Student(String studName, int studRollNo) {
            name = studName;
            rollNumber = studRollNo;
        }
    }

    public static Student myFunction(String name, int rollNumber) {
        Student s1 = new Student(name, rollNumber);
        // s1.name = name;
        // s1.rollNumber = rollNumber;
        return s1;
    }
}