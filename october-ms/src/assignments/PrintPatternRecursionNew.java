package assignments;

public class PrintPatternRecursionNew {
    static void printPattern(int n, int curr, boolean flag) {
        if (curr > n) {
            return;
        }
        System.out.print(curr + " ");
        if (flag == true) {
            curr = curr - 5;
            if (curr <= 0) {
                flag = false;
            }
        } else {
            curr = curr + 5;
        }
        printPattern(n, curr, flag);
    }

//    public static void main(String[] args) {
//        printPattern(10, 10, true);
//    }
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