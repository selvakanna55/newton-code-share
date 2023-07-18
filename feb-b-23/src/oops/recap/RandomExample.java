package oops.recap;


import java.util.Random;

public class RandomExample {
    public static void main(String args[]) {
        // int arr[] = {12, 22, 32, 42};
        // for(int i=0;i<19;i++){
        //     System.out.println(arr[i%arr.length]);
        // }


        // find random number from 1 to 6 -> dice roll
        Random obj = new Random();
        System.out.println(obj.nextInt(100) + 1);
        System.out.println(obj.nextInt(6) + 1);
        System.out.println(obj.nextInt(6) + 1);
        System.out.println(obj.nextInt(6) + 1);
        System.out.println(obj.nextInt(6) + 1);
        System.out.println(obj.nextInt(6) + 1);
        System.out.println(obj.nextInt(6) + 1);
    }
}