package searching;


class LinearSearch {
    public static int linearSearch(int arr[], int target) {
        // TC: O(n) , SC: O(1)
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {10, 12, 5, -4, 3};
        System.out.println(linearSearch(arr, 5));
        System.out.println(linearSearch(arr, 10));
        System.out.println(linearSearch(arr, 99));
    }
}