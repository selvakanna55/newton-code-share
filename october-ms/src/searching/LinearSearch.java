package searching;

public class LinearSearch {
    public static int linearSearch(int arr[], int number) {
        // T: O(n)
        // S: O(1)
        int ans = -1; // not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 14, 99, 99, -3, 11};
        System.out.println(linearSearch(arr, 99));
        System.out.println(linearSearch(arr, -3));
        System.out.println(linearSearch(arr, 1234));
    }
}
