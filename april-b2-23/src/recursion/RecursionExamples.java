package recursion;


class RecursionExamples {

    public static int sumTillN(int num) {
        if (num == 1) {
            return 1;
        }
        int sum = num + sumTillN(num - 1);
        return sum;
    }

    public static void main(String args[]) {
        int n = 3;
        int sum = sumTillN(n);
        System.out.println(sum);
    }


    // static int sum = 0;
    // public static void printSumTillN(int i, int n){
    //     if(i>n){
    //         return;
    //     }
    //     sum = sum + i;
    //     printSumTillN(i+1, n);
    // }


//    public static int sumTillN(int i, int num){
//         if(i>num){
//             return 0;
//         }
//         int sum = i + sumTillN(i+1, num);
//         return sum;
//     }


    public static void printHello(int num) { // function definition
        if (num > 3) {
            return;
        }
        System.out.println("hello");
        printHello(num + 1);
    }

    public static void printNumberTillN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNumberTillN(i + 1, n);
    }
}