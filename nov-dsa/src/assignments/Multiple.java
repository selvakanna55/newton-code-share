package assignments;

public class Multiple {
    static int[] countOfNumbers(int arr[], int n) {
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] % arr[i] == 0) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}