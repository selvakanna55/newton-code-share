package strings;


class Methods {
    public static void main(String args[]) {


        String s1 = "Apple";
        String s2 = "Fruit";

        // concat -> merge two string
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

        // substring(statIndex, endIndex+1) -> some portion of the string
        System.out.println(s1);
        int statIndex = 1;
        int endIndex = 3;
        System.out.println(s1.substring(statIndex, endIndex)); //ppl [1-3]

        for (int i = statIndex; i < endIndex; i++) {
            System.out.print(s1.charAt(i));
        }


        // equals - https://i.stack.imgur.com/EJtdg.png
        String ss1 = "Cat";
        String ss2 = "Cat";
        String ss3 = new String("Cat");


        System.out.println(ss1 == ss2); //100==100
        System.out.println(ss1 == ss3); // 100 == 110
        System.out.println(ss1.equals(ss3)); // Cat==Cat

    }
}


