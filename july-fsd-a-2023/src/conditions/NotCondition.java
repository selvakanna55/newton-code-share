package conditions;

public class NotCondition {

    public static void main(String args[]) {
        System.out.println(10 > 4); //true
        System.out.println(!(10 > 4)); //false

        System.out.println(10 % 2 == 0); //true
        System.out.println(!(10 % 2 == 0)); //false


        System.out.println(10 == 10); // true
        System.out.println(10 != 4); // true
        System.out.println(10 != 9); // true
    }
}