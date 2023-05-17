package strings;

public class StringExample {
    public static void main(String[] args) {

        String name = "newton";
        // Scanner scan = new Scanner(System.in);
        String name3 = new String("newton");

    
        System.out.println(name);
        System.out.println(name3);
        System.out.println("Hai".toUpperCase()); //HAI
        System.out.println("Hai".toLowerCase()); //hai


        String fruit = "Apple";
        System.out.println(name);
        System.out.println(name.charAt(2)); // arr[2]
        System.out.println(name.concat(fruit)); // name + fruit
        System.out.println(name.substring(1, 4)); // ewt
        System.out.println(name.substring(2, 4)); // wt
        System.out.println(name.substring(3, 6)); // ton


        // ----------------------------------------------------------
        // string to array, array to string
        String word = "open";
        System.out.println(word);
        char arr[] = word.toCharArray(); // {'o','p','e','n'}
        arr[1] = 'x';
        String word2 = new String(arr); //array to String
        System.out.println(word2);
    }
}
