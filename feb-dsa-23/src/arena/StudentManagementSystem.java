package arena;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed

public class StudentManagementSystem {
    static class Student {
        String name;
        int rollNo;
        int marks1;
        int marks2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

        // Accepting student details
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student();
            scanner.nextLine(); // Consume the newline character left by nextInt()


            students[i].name = scanner.nextLine();


            students[i].rollNo = scanner.nextInt();


            students[i].marks1 = scanner.nextInt();


            students[i].marks2 = scanner.nextInt();
        }

        // Displaying student details

        for (int i = 0; i < numStudents; i++) {

            System.out.println("Name :  " + students[i].name);
            System.out.println("RollNo :  " + students[i].rollNo);
            System.out.println("Marks1 :  " + students[i].marks1);
            System.out.println("Marks2 :  " + students[i].marks2);

            System.out.println();
            System.out.println();
        }
    }
}