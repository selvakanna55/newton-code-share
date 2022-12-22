public class BinarySearch {
    static int bs(int arr[], int n, int t) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == t) return mid;
            else if (arr[mid] > t) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(bs(arr, arr.length, 20));
        System.out.println(bs(arr, arr.length, 50));
        System.out.println(bs(arr, arr.length, 7452));
    }
}
