package arena;


import java.io.*;
import java.util.*;

class SuperString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            String s = sc.next();
            int counta = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') counta++;
            }
            if (counta > s.length() / 2) { // string already good
                System.out.println(s.length());
            } else {
                System.out.println(counta + (counta - 1));
            }
        }
    }
}
