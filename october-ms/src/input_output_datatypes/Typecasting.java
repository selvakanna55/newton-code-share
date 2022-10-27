package input_output_datatypes;

public class Typecasting {
    public static void main(String[] args) {
        float percentage = 99.5f;
        int age = 10;
        int per = (int) percentage; // typecasting
        System.out.println(per);
        // converting one type data into another type of data
        int a = 10;
        int b = 3;
        float num1 = (float) a;
        float num2 = (float) b;
        int x = (int) num1;
        System.out.println(a / b); // why? int cannot store .values
        System.out.println(num1 / num2);
        int y = 1000000000;
    }
}
