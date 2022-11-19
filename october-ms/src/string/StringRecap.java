package string;

import java.util.*;

public class StringRecap {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = "abcd";
//        // \n -> new line
//        String name2 = new String("MNOP");
//        // arr[2] -> name.charAt(2)
//        System.out.println(name);
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(0));


        // string cannot be modified ->
        String animal1 = "Cat";
        //"Cat" -> ['c', 'a', 't']
        char arr[] = animal1.toCharArray();
        String animall = new String(arr); // ['c', 'a', 't'] -> "Cat"
        String animal2 = "Cat";
        String animal3 = new String("Cat");
        String animal4 = "Dog";

//        System.out.println(animal1 == animal2); // true
//        System.out.println(animal1 == animal3); //false
        System.out.println(animal1.equals(animal3)); //true
        System.out.println(animal1.equals(animal4)); //false
    }
}
