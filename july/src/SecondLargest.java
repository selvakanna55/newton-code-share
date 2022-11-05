import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
//        Arrays.sort(arr);
//        System.out.println(arr[n - 2]);
        int maxi = Integer.MIN_VALUE;
        int maxiIndex = -1;
        for (int i = 0; i < n; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
                maxiIndex = i;
            }
        }
        System.out.println(maxiIndex);
        System.out.println(maxi);

        arr[maxiIndex] = Integer.MIN_VALUE;

        maxi = Integer.MIN_VALUE;
        maxiIndex = -1;
        for (int i = 0; i < n; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
                maxiIndex = i;
            }
        }
        System.out.println(maxiIndex);
        System.out.println(maxi);


    }
}
