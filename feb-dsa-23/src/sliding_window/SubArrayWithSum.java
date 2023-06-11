package sliding_window;

public class SubArrayWithSum {

    // sub array with given sum
    public static void main(String args[]) {
        // int arr[] = {1,3,7,4,11,15, 8, 13};
        int arr[] = {1, 2, 3, 4, 5};
        // int arr[] = {11,9,8,7,13,5, 17};
        int n = arr.length;
        int sum = 988;
        boolean ans = false;

        int start = 0;
        long currSum = 0;
        for (int end = 0; end <= n; end++) {
            while (currSum > sum && start < end - 1) {
                currSum = currSum - arr[start];
                start++;
            }
            if (currSum == sum) {
                ans = true;
                break;
            }
            if (end < n) {
                currSum = currSum + arr[end];
            }
        }
        System.out.println(ans);
    }
}


// for(int i=0;i<n;i++){
//             int currSum = 0;
//             for(int j=i;j<n;j++){
//                 currSum = currSum + arr[j];
//                 if(sum == currSum){
//                     ans = true;
//                     break;
//                 }
//             }
// }