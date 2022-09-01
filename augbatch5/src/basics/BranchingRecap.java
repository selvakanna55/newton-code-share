package basics;

public class BranchingRecap {
    public static void main(String[] args) {
        System.out.println("begin");
        int num = 61;

//        if (num % 2 == 0) {
//            if (num % 5 == 0) {
//                System.out.println("div by 2 and 5");
//            } else {
//                System.out.println("div by 2 and not div by 5");
//            }
//        } else {
//            System.out.println("not div by 2 and 5");
//        }


        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        //      =       condition ? true:false
        System.out.println((a > b)  ? a   :  b);


        System.out.println("end");
    }
}
