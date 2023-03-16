package string;


class StringEquals {
    public static void main(String args[]) {
        String s1 = "Cat";
        String s3 = new String("Cat");
        String s2 = "Cat";
        if (s1 == s2) {
            System.out.println("a and c is same");
        } else {
            System.out.println("a and c is not same");
        }

        if (s1.equals(s3)) {
            System.out.println("a and b is same");
        } else {
            System.out.println("a and b is not same");
        }
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