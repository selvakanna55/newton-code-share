package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MonsterHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int time = 0;
        int i = 0;
        while (arr[k] > 0) {
            i = i % n;
            if (arr[i] > 0) {
                arr[i]--;
                time++;
            }
            i++;
        }
        System.out.println(time);

    }
}