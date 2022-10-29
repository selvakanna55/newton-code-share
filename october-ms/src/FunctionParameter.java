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

    public static void main(String[] args) {
        System.out.println("Begin");
        int mark = 80;
        String grade = getGrade(mark);
        System.out.println(grade);
        System.out.println("End");
    }
}
