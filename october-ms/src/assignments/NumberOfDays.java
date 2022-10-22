package assignments;

public class NumberOfDays {


    static void numberofdays(int M) {
        if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
            System.out.println(31);
        } else if (M == 4 || M == 6 || M == 9 || M == 11) {
            System.out.println(30);
        } else if (M == 2) {
            System.out.println(28);
        }
//
//        if (M % 2 == 0) {
//            if (M == 2) {
//                System.out.println(28);
//            } else {
//                if (M >= 8) {
//                    System.out.println(31);
//                } else {
//                    System.out.println(30);
//                }
//            }
//        } else {
//            if (M <= 7) {
//                System.out.println(31);
//            } else {
//                System.out.println(30);
//            }
//        }
    }
}
