package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AlternateSumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long product = 1;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (i % 2 == 0) { //sum
                sum = sum + num;
            } else { // product
                product = product * num;
            }
        }
        System.out.println(sum + " " + product);
    }
}