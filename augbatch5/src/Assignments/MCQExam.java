package Assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MCQExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximum = 0;
        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            if (num > maximum) {
                maximum = num;
            }
        }
        System.out.println(maximum);
        // // find max 2 a , b
        // if(a>b){
        //     a
        // }else{
        //     b
        // }

        // find max 3 a, b, c

        // if(a>b){
        //     if(a>c) System.out.println(a);
        //     else System.out.println(c);
        // }else if(b>c) System.out.println(b);
        // else System.out.println(c);


    }
}