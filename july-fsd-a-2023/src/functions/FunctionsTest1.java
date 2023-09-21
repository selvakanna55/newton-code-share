package functions;

public class FunctionsTest1 {
    public static void printSumOfThreeNumbers() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }

    public static void averageOfThreeNums(int a, int b, int c) {
        int sum = a + b + c;
        int averge = sum / 3;
        System.out.println(averge);
    }


    public static void main(String[] args) {
        int dflkjbv = getAverage();
        System.out.println(dflkjbv);
    }


    public static int getAverage() {
        int a = 10;
        int b = 20;
        int c = 30;
        int sum = a + b + c;
        int average = sum / 3;
        System.out.println(average);
        return average;
    }


}
