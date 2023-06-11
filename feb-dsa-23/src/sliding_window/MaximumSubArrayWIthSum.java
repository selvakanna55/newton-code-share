package sliding_window;

public class MaximumSubArrayWIthSum {

    // print maximum sub array sum with size k
    public static void main(String args[]) {
        // int arr[] = {10, 12, 5, 6, 9, 8, 13, 7, 20}
        int arr[] = {20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 3;
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum = currSum + arr[i];
        }
        int maxSum = currSum;
        for (int i = k; i < n; i++) {
            currSum = currSum + arr[i] - arr[i - k];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);
    }
}

//  for(int i=0;i<=n-k;i++){
//             int currSum = 0;
//             for(int j=i;j<i+k;j++){
//                 currSum = currSum + arr[j];
//             }
//             if(currSum>maxSum){
//                 maxSum = currSum;
//             }
//         }