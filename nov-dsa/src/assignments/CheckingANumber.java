package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 0: //if(num==0)
                System.out.println("Zero");
                break;
            default: //else
                int temp = 1;
                if (num < 0) {
                    temp = 0;
                }
                switch (temp) {
                    case 1:
                        System.out.println("Positive");
                        break;
                    case 0:
                        System.out.println("Negative");
                        break;
                }
        }
    }
}