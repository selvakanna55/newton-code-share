package conditions;

public class LoopsRecap2 {
    public static void main(String[] args) {
//        int n = 10;
//        for (int i = 0; i < n; i++) {
//            System.out.println("hi");
//        }
//        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

//        int fact = 6;
//        int ans = 1;
//        for(int i=1;i<=fact;i++){
//            ans = ans * i;
//        }
//        System.out.println(ans);


        // 1^2 2^2 3^2 4^2
        // dont print sqrt(4)
        // sqrt(i) should not greater then 70
        int n = 10;
//        for (int i = 1; i <= n; i++) {
//            if (i == 4) {
//                continue;
//            }
//            int square = i * i;
//            if (square > 70) {
//                break;
//            }
//            System.out.println(i + " " + square);
//        }
        int i = 20;
        while (i < 10) {
            System.out.print(i * i + " ");
            i++;
        }

        System.out.println();

        i = 20;
        do {
            System.out.print(i * i + " ");
            i++;
        } while (i < 10);


    }
}
