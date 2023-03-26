package arena;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
// maximum sum of adjectcent elemntg

class FirstLastContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 0; j < T; j++) {
            int N = sc.nextInt();

            int arr[] = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = arr[0] + arr[N - 1];
            for (int i = 0; i < N - 1; i++) {
                int curr = arr[i] + arr[i + 1];
                sum = Math.max(sum, curr);
            }
            System.out.println(sum);
        }
    }
}