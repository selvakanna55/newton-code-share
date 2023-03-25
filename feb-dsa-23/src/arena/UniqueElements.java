package arena;


import java.util.Scanner;

//https://my.newtonschool.co/playground/code/36zwp4omz5dn/
// don't change the name of this class
// you can add inner classes if needed
class UniqueElements {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        long freq[] = new long[1000001];
        for (int i = 0; i < n; i++) {
            freq[nums[i]] += 1;
        }
        for (int i = 0; i < 1000001; i++) {
            if (freq[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}