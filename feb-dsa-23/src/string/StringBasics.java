package string;


class StringBasics {
    public static void main(String args[]) {
        String word = "Apple ";
        System.out.println(word.charAt(0)); // arr[2]
        int n = word.length(); //arr.length;
        String word2 = "Orange"; // + means concatination
        System.out.println(word + word2);
        System.out.println(word.concat(word2));
        // string -> number
        //"123" -> 123
        String num1 = "123";
        String num3 = "123.99"; // double
        int num2 = Integer.parseInt(num1);
        double num4 = Double.parseDouble(num3);
        System.out.println(num2);
        System.out.println(num4);

        String curr = "ABCD";
        System.out.println(curr.substring(0, 3)); // ABC
        System.out.println(curr.substring(1, 4)); //BCD
        System.out.println(curr.substring(2, 3)); //C
        System.out.println(curr.substring(0, 1)); //C

    }
}

// System.out.println(n);
//         for(int i=0;i<n;i++){
//             System.out.print(word.charAt(i)+" ");
//         }


//    Scanner scann = new Scanner(System.in);
//    String word = "eat";
//    String name = scann.nextLine(); //read whole line
//    System.out.println(name);