package recursion;

public class PrintArray {

    static void rec(int arr[], int i, int n) {
        if (i == n) {
            return;
        }
        System.out.print(arr[i] + " ");
        rec(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = {11, 9, 7, 5};
        int n = arr.length;
        rec(arr, 0, n);
    }
}
