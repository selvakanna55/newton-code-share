package oops.basics;


import java.util.*;

class ClassObjWithScanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(); // creating new Student object
        s1.name = sc.next();
        s1.rollNo = sc.nextInt();
        s1.gender = sc.next().charAt(0);
        s1.percentage = sc.nextDouble();
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.gender);
        System.out.println(s1.percentage);

    }
}


