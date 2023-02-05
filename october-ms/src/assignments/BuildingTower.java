package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class BuildingTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean visited[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = n;
        for (int i = 0; i < n; i++) {
            visited[arr[i]] = true;
            if (visited[start]) {
                while (visited[start]) {
                    System.out.print(start + " ");
                    start--;
                }
            }
            System.out.println();
        }
    }
}
