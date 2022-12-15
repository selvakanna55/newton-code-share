package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b + c || b == a + c || c == a + b) { //O(1)
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}