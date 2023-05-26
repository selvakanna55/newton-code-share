package searching;

public class LinearBinary {


    public static int linearSearch(int arr[], int number) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int number) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) return mid;
            if (number > arr[mid]) right = mid - 1; // change < to > in binarySearch
            else left = mid + 1;
        }
        return -1; // if not found
    }

    public static void main(String args[]) {
        // int arr[] = {4, 6, 18, 22, 29, 31};
        int arr[] = {31, 29, 22, 18, 6, 4}; //desceding order
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 13));
    }

}