package kadanes_algo;


public class KadanesAlgo {
    void nsquareAns() {
        // int arr[] = {-3,1,-8,12,0,-3,5,-9,4};
        int arr[] = {-8, 12, 0, -3, 5};
        int n = arr.length;

        int maximumSum = arr[0];
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum = currSum + arr[j];
                if (currSum > maximumSum) {
                    maximumSum = currSum;
                }
                //
            }
        }
        System.out.println(maximumSum);
    }

    public static void main(String args[]) {
        //  int arr[] = {-3,1,-8,12,0,-3,5,-9,4};
        // int arr[] = {-8,12,0,-3,5};
        int arr[] = {-1, 3, -7, 12, -1, 4};
        int n = arr.length;

        int maximumSum = arr[0];
        int newIdx = 0;
        int start = 0, end = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];
            if (currSum > maximumSum) {
                start = newIdx;
                end = i;
                maximumSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
                newIdx = i + 1; // new sub begin from next idx
            }
        }
        System.out.println(maximumSum);
        System.out.println(start + " " + end);
    }
}