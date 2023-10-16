package strings;


import java.lang.*;

class StringBuilderBufferExamples {

    void createNewStringEveryTime() {
        // modifying string creates a new string
        String word = "";
        word = word + "Hello "; // creates new string
        System.out.println(word);

        word = word + "How ";  // creates new string
        System.out.println(word);

        word = word + "are ";  // creates new string
        System.out.println(word);

        word = word + "you? ";  // creates new string
        System.out.println(word);
    }

    public static void main(String args[]) {
        // Scanner      scan = new Scanner(System.in);
        // StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append("hai "); // ads string to it
        System.out.println(sb);

        sb.append("how "); // ads string to it
        System.out.println(sb);

        sb.setCharAt(1, 'o');
        System.out.println(sb.charAt(1));
        System.out.println(sb);

        String res = sb.toString();

        System.out.println(res);


        sb.reverse();
        System.out.println(sb);

    }
}