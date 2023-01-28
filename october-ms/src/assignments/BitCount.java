package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class BitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int countBits = 0;
        while (n > 0) {
            if ((n & 1L) == 1) { //(n%2==1){
                countBits++;
            }
            n = n >> 1; //n/2;
        }
        System.out.println(countBits);
    }
}