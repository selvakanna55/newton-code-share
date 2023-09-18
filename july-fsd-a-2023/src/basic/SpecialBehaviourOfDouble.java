package basic;

public class SpecialBehaviourOfDouble {
    public static void main(String[] args) {

        double num = 10.12;
        double multiply = num * 100; // 1011.9999999999999
        System.out.println(multiply);
        System.out.println((long) multiply);

    }
}
