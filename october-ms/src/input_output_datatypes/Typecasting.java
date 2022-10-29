package input_output_datatypes;

public class Typecasting {
    public static void main(String[] args) {
//        int totalMarks = 498;
//        int totalSub = 5;
//        float mark = (float) totalMarks;
//        float sub = (float) totalSub;
//        float percentage = mark / sub;
//        System.out.println(percentage);
//        //99.6 -> 99
//        int per = (int) percentage;
//        System.out.println(per);

        String num1 = "10";
        System.out.println(num1);
        //"10" -> 10
        int num2 = Integer.parseInt(num1);
        System.out.println(num2);
        //"10" -> 10.0
        float num3 = Float.parseFloat(num1);
        System.out.println(num3);

        //100->"100"
        String x = Integer.toString(100);
        System.out.println(x);

    }
}
