package assignments;

public class PrintAllSubarrays {
    static void rec(int arr[], int k, int n) {
        if (k == n) {
            return;
        }
        System.out.print(arr[k] + " ");
        rec(arr, k + 1, n);
    }

    // 0,1,2 ,3
    static void PrintSubarrays(int Arr[], int N) {

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                rec(Arr, i, j + 1);
                System.out.println();
            }
        }
    }
}
