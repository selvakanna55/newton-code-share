package modulo_arithmatic;


public class PrintArrayInCircularForm {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void simpleSolutionTwoLoops(int arr[], int start) {
        int n = arr.length;
        for (int i = start; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < start; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void singleLoopWithMod(int arr[], int start) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // System.out.println( (start+i) + " "+ (start+i)%n+" "+ arr[(start+i)%n]);
            System.out.print(arr[(start + i) % n] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 10, 1, 2, 3, 4, 5, 6};
        simpleSolutionTwoLoops(arr, 4);
        singleLoopWithMod(arr, 4);
    }
}