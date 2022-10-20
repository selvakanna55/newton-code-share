package basics;


import java.util.*;
import java.lang.*;

class PatternPrinting {
    public static void main(String args[]) {
        //    //1 2 3 ... 10
        //    int n = 10;
        //    for(int i=1;i<=n;i++){
        //        System.out.print(i+" ");
        //    }
        //    System.out.println();
        //    for(int i=1;i<=n;i=i+2){
        //        System.out.print(i+" ");
        //    }

        //    System.out.println();
        //    for(int i=2;i<=n;i=i+2){
        //        System.out.print(i+" ");
        //    }
        //    System.out.println();

        //    for(int i=1;i<=n;i++){
        //        System.out.print(i*8+" ");
        //    }

        //     System.out.println();
        //    for(int i=7;i<=70;i=i+7){
        //        System.out.print(i+" ");
        //    }
        // i = i+1 -> i++


        Scanner scan = new Scanner(System.in);

        //     ***
        //     ***
        //     ***


        //    int n = scan.nextInt();
        //    int star = scan.nextInt();

        //    for(int row=1;row<=n;row++){
        //         for(int i=1;i<=star;i++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //    }

        //*
        // **
        // ***
        // ****
        // *****
        //    int n = scan.nextInt();
        //    for(int row=1;row<=n;row++){
        //         for(int i=1;i<=row;i++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //    }


        // 1
        // 12
        // 123
        // 1234
        // 12345
        //    int n = scan.nextInt();
        //    for(int row=1;row<=n;row++){
        //         for(int i=1;i<=row;i++){
        //             System.out.print(i);
        //         }
        //         System.out.println();
        //    }


        int n = scan.nextInt();
        for (int row = 1; row <= n; row++) {
            for (char i = 'a'; i < 'a' + row; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}