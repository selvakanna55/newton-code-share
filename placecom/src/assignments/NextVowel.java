package assignments;


import java.util.Scanner;

public class NextVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'a':
                    sb.append('e');
                    break;
                case 'e':
                    sb.append('i');
                    break;
                case 'i':
                    sb.append('o');
                    break;
                case 'o':
                    sb.append('u');
                    break;
                case 'u':
                    sb.append('a');
                    break;
                default:
                    sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}