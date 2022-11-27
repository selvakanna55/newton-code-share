package assignments;

public class PrintPattern {
    static void printPattern(int n, int curr, boolean flag) {
        if (curr > n) {
            return;
        }
        System.out.print(curr + " ");
        if (flag) {
            curr = curr - 5;
            if (curr <= 0) {
                flag = false;
            }
        } else {
            curr = curr + 5;
        }
        printPattern(n, curr, flag);
    }

// curr = n;
//     while(curr>0){
//         System.out.print(curr+" ");
//         curr = curr - 5;
//     }
//     while(curr<=n){
//         System.out.print(curr+" ");
//         curr = curr + 5;
//     }
}
