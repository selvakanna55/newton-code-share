package recursion;

public class Sum1ToN {
    static void printTillN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        printTillN(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        printTillN(1, n);
//        int i = 1;
//        while (true) {
//            if (i > n) {
//                break;
//            }
//            System.out.print(i + " ");
//            i++;
//        }
    }
}

