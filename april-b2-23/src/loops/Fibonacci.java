package loops;

class Fibonacci {
    public static void main(String args[]) {
        int n = 20;
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 3; i <= n; i++) {
            int curr = n1 + n2;
            System.out.println(curr);
            n1 = n2;
            n2 = curr;
        }
    }
}