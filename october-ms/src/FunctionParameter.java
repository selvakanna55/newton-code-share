import java.util.Scanner;

public class FunctionParameter {
    public static int addTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }


    public static float addFloatNum(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static String getGrade(int mark) {
        String grade = "";
        if (mark >= 90) {
            grade = "A";
        } else if (mark < 90 && mark >= 80) {
            grade = "B";
        } else if (mark < 80 && mark >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    public static float findAverage(int a, int b, int c) {
        int sum = a + b + c;
        float average = (float) sum / (float) 3;
        return average;
    }

    //a^b
    //2^3
    public static float pow(float a, float b) {
        // return a^b
        float ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Begin");
        // print average of 3 numbers
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float power = pow(a, b);
        System.out.println(power);
        System.out.println("End");
    }
}
