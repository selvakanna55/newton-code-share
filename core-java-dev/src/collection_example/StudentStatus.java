package collection_example;

public enum StudentStatus {
    ACTIVE,
    INACTIVE,
    PLACED


}

enum Days {
    SUN(1), //1
    MON(2),
    TUE(3),
    WED(4),
    THU(5),
    FRI(6), //6
    SAT(7);
    int dayOfTheWeek;

    Days(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

}