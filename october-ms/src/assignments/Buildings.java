package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class Buildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxi = arr[0];
        int visible = 1;
        for (int i = 1; i < n; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
                visible++;
            }
        }
        System.out.println(visible);
        //t Your code here
    }
}