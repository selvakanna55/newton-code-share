import javafx.print.Collation;

import java.util.*;

class Student {
    String name;
    StudentStatus status;

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", status=" + status.getId() + '}';
    }

    public Student(String name, StudentStatus status) {
        this.name = name;
        this.status = status;
    }

}

enum StudentStatus {
    ACTIVE(1),
    INACTIVE(2),
    PLACED(3),
    ISASIGNED(4),
    ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;


    StudentStatus(int id) {
        this.id = id;
    }

}


class Sorterrrrr implements Comparator<Integer> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Integer a, Integer b) {

        return a - b;
    }
}

//

public class EnumExample {
    public static void main(String[] args) {
//        Student s1 = new Student("abcd", StudentStatus.ACTIVE);
//        Student s2 = new Student("skjdc", StudentStatus.INACTIVE);
//        Student s3 = new Student("dkjc", StudentStatus.ISASIGNED);
//        System.out.println(s1);
//        System.out.println(s2);
//        // ACTIVE, PLACED, ISASIGNED

        List<Integer> li = Arrays.asList(3, 1, 2);
        System.out.println(li);
//        Collections.sort(li, (a, b) -> b - a);
        Collections.sort(li, new Sorterrrrr());
        System.out.println(li);

    }
}
