package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FindPositionsOfXInArray {
    static boolean linearSearch(int arr[], int target) {
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                isFound = true;
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean isFound = linearSearch(arr, x);
            if (!isFound) {
                System.out.print("Not found");
            }
            System.out.println();
        }
    }
}