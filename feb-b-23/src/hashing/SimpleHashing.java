package hashing;


import java.util.*;
import java.io.*;

class SimpleHashing {
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int hashTable[] = new int[10];
    //     int n = sc.nextInt();
    //     for(int i=0;i<n;i++){
    //         int num = sc.nextInt();
    //         hashTable[num] = num;
    //     }
    //     System.out.println(Arrays.toString(hashTable));

    //     System.out.println("5 is present "+(hashTable[5]==5)); //O(1)
    //     System.out.println("7 is present "+(hashTable[7]==7));
    // }
    // // time complexity -> O(1)
    // // spece complexity -> O(n)
    // // input must be less than hashTable size


    public static int hasFunction(int num) {
        return num % 9;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tableLength = 9;
        int hashTable[] = new int[tableLength];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            hashTable[hasFunction(num)] = num;
        }
        System.out.println(Arrays.toString(hashTable));

        System.out.println("29 is present " + (hashTable[hasFunction(29)] == 29)); //O(1)
        System.out.println("17 is present " + (hashTable[hasFunction(17)] == 17));
        System.out.println("50 is present " + (hashTable[hasFunction(50)] == 50));
    }
    // time complexity -> O(1)
    // spece complexity -> O(n)
    // when remainder is same
}