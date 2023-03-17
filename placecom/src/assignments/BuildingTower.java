package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BuildingTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> visited = new HashSet<>();
        int maxiNumber = n;
        for (int i = 0; i < n; i++) {
            visited.add(arr[i]);
            while (visited.contains(maxiNumber)) {
                System.out.print(maxiNumber + " ");
                maxiNumber--;
            }
            System.out.println();
        }
    }
}