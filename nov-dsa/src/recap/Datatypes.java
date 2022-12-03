package recap;

public class Datatypes {
    public static void main(String[] args) {
        int num = 10; // long
        float num3 = 9.5f;
        double num2 = 10.5;
        char ch = 'a';
        String name1 = "Newton";
        String name2 = "School";
        System.out.print(name1 + " " + name2);
        // typecasting
        //10 -> 10.0
        double num4 = (double) num;
        //10.5; -> 10
        int num5 = (int) num2;

        //10 -> "10"
        String num6 = String.valueOf(10);
        //"10" -> 10
        int num7 = Integer.parseInt("10");
    }
}
