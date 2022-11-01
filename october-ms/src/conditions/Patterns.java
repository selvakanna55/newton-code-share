package conditions;

public class Patterns {
    void recallFor() {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            // + concat
            System.out.print(i + " ");
        }
        System.out.println();
        // i-- => i = i-1
        for (int i = 10; i >= 5; i--) {
            System.out.print(i + " ");
        }
        // 4>=5
        //>=1
        //5,4.3.2,1
        //0>=1
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 25; i <= 100; i++) {
            if (i % 14 == 0) {
                break; // stops the loop
            }
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
//
//        // 4
////        *
////        **
////        ***
////        ****
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }


//   *
//  **
// ***
//****
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int k = 0; k < n - i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }


//        123
//        456
//        789
        int n = 3;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
