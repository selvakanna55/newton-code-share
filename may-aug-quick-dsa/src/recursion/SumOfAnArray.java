package recursion;


public class SumOfAnArray {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    // static int sum = 0;
    static int sumArray(int arr[], int i) {
        int sum = 0;
        if (i < arr.length) {
            sum = arr[i] + sumArray(arr, i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7};
        // for(int i=0;i<arr.length;i++){
        //     sum = sum + arr[i];
        // }
        System.out.println(sumArray(arr, 0));
    }
}