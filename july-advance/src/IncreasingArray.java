import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int fac = 2;
        boolean ans = true;
        for (int i = 1; i < n; i++) {
            while (fac <= arr[i] && arr[i] % fac != 0) {
                fac++;
            }
            // System.out.println(fac+" "+arr[i]);
            if (fac > arr[i]) {
                ans = false;
                break;
            }
            fac++;
        }
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}