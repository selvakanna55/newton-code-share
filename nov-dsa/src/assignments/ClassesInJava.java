package assignments;

import java.util.Scanner;

public class ClassesInJava {
    static Scanner sc = new Scanner(System.in);

    static class Student {
        String name;
        int eng;
        int maths;
        int hindi;
    }

    static Student[] createStudentArray(int n) {
        Student arr[] = new Student[n];
        for (int i = 0; i < n; i++) {
            Student s1 = new Student();
            s1.name = sc.next();
            s1.eng = sc.nextInt();
            s1.maths = sc.nextInt();
            s1.hindi = sc.nextInt();
            arr[i] = s1;
        }
        return arr;
    }

    static int engAverage(Student st[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + st[i].eng;
        }
        return sum / n;
    }

    static int avgPercentageOfClass(Student st[], int n) {
        int avg = 0;
        for (int i = 0; i < n; i++) {
            int sum = st[i].eng + st[i].maths + st[i].hindi;
            avg = avg + (sum / 3);
        }
        return avg / n;
    }
}