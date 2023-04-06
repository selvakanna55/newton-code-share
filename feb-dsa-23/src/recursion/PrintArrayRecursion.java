package recursion;

public class PrintArrayRecursion {
    public static void recursionPrintArray(int arr[], int i) {
        if (i >= arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        recursionPrintArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 13, 14};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        recursionPrintArray(arr, 0);
    }
}
