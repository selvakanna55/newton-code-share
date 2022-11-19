package string;

import java.util.Locale;
import java.util.Scanner;

public class StringBasics {
    void concat() {
        int num1 = 10;
        int num2 = 20;
        int add = num1 + num2;
        System.out.println(add);
        String firstName = "Varun";
        String lastName = "Kumar";
        String res = firstName + " " + lastName; // string concat
        System.out.println(res);
    }

    void asciiToInt() {
        char ch = '8';
        int num = ch - '0';
        int num1 = (int) ch;
        System.out.println(num);
        System.out.println(num1);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String name = "Newton";
//        String location = new String("Bombay");
//        System.out.println(name);
//        // arr[0]
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));

        String word1 = "aamm";
        String word2 = "bb";
        System.out.println(word1.concat(word2));
        System.out.println(word1 + word2);
        System.out.println(word1.replace('a', 'z'));
        System.out.println(word1.toUpperCase());

        String q = "how are you?";
        System.out.println(q.contains("how")); // true
        System.out.println(q.contains("newton")); //false
        String namee = "newton";
        System.out.println(namee.substring(2, 4 + 1)); // true
        String x1 = "101";
        int num2 = Integer.parseInt(x1);
        float num3 = Float.parseFloat(x1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
