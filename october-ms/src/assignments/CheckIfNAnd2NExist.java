package assignments;


import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckIfNAnd2NExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = false;
        // n^2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] * 2 == arr[j]) {
                    ans = true;
                    break;
                }
            }
        }
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}