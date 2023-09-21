package functions;


// don't change the name of this class
// you can add inner classes if needed
class FunctionTest2 {

    public static void main(String[] args) {
        int ans = printMaxOf3(10, 25, 19);
        System.out.println(ans);
    }


    public static int printMaxOf3(int a, int b, int c) {
        int ans;
        if (a > b && a > c) {
            ans = a;
        } else if (b > a && b > c) {
            ans = b;
        } else {
            ans = c;
        }
        System.out.println(ans);
        return ans;
    }

    public static String name() {
        String myName = "Raja";
        return myName;
    }


    public static void avergeOfThreeNums(int a, int b, int c) {
        int sum = a + b + c;
        int averge = sum / 3;
        System.out.println(averge);
    }


    public static void printSumOfThreeNumbers() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }
}
