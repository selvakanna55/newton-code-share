package searching;


class LinearSearching {
    public static int find(int arr[], int target) {
        int index = -1; //not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String args[]) {
        int arr[] = {4, 99, 6, 51};
        // int arr[] = {10,12,-4,-9,6,44,66};
        int ans = find(arr, 22);
        System.out.println(ans);
    }
}