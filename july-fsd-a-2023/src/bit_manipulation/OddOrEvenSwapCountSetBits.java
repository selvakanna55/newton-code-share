package bit_manipulation;


public class OddOrEvenSwapCountSetBits {

    public static void OddOrEven(int num) {
        if ((num & 1) == 0) { // check first bit is 0
            // if(num%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void swap(int a, int b) {
        System.out.println(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }

    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(11));
        System.out.println(countSetBits(10));
        System.out.println(countSetBits(7));
        System.out.println(countSetBits(15));
        // swap(10,7);
        // swap(11, 5);
        // System.out.println(10^10);
        // System.out.println(3^3);
        // System.out.println(75^75);
        // System.out.println(75^7);
    }
}


// OddOrEven(10);
//         OddOrEven(11);
//         OddOrEven(198);
//         OddOrEven(299);

// System.out.println(10&3);
//         System.out.println(10|5);
//         System.out.println(10^3);