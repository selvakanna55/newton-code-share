package basics;

public class IceCream {

    public static void main(String args[]) {
        String s = "j(ne)x()t";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                System.out.print("o");
                i = i + 1;
            } else if (i + 3 < n && s.charAt(i) == '(' && s.charAt(i + 1) == 'n' && s.charAt(i + 2) == 'e' && s.charAt(i + 3) == ')') {
                System.out.print("ne");
                i = i + 3;
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}