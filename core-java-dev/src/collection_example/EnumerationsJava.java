package collection_example;

//

//class ConstantsClass {
//    final static String ACTIVE = "ACTIVE";
//    final static String PLACED = "PLACED";
//}

class Student {
    int rollNo;
    String name;
    int score;
    StudentStatus status;


    public Student(int rollNo, String name, int score, StudentStatus status) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
        this.status = status;
    }

    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", score=" + score + ", status=" + status + '}';
    }
}

public class EnumerationsJava {

    void printLunchMenu(Days day){
        switch (day){
            case SUN:
                System.out.println("abcd");
                break;
            case FRI:

        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(10, "Newton", 100, StudentStatus.PLACED);
        Student s2 = new Student(10, "abcd", 100, StudentStatus.ACTIVE);
        System.out.println(s1);
        s1.status = StudentStatus.ACTIVE;
        System.out.println(s1);
        System.out.println(Days.FRI.toString());
        Days today = Days.valueOf("FRI");
        System.out.println(today);
        System.out.println(today.dayOfTheWeek);


    }
}
