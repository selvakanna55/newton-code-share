package searching;

public class BinarySearch {
    public static int binarySearch(int arr[], int number) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) {
                return mid; // number  is found
            }
            if (arr[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 14, 18, 20, 21, 23};
        System.out.println(binarySearch(arr, 20));
        System.out.println(binarySearch(arr, 14));
        System.out.println(binarySearch(arr, 34));
    }
}
