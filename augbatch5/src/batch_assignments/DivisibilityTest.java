package batch_assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class DivisibilityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int num = ch - '0';
            sum = sum + num;
        }
        if (sum % 3 == 0 && s.charAt(n - 1) == '0') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}