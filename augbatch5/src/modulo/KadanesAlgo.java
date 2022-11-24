package modulo;

public class KadanesAlgo {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        int maxiSumSoFar = arr[0];
        int currentSum = arr[0];
        int begin = 0;
        int end = 0;
        int newStart = 0;
        for (int i = 1; i < n; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum > maxiSumSoFar) {
                maxiSumSoFar = currentSum;
                begin = newStart;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                newStart = i + 1;
            }
        }
        System.out.println(maxiSumSoFar);
        System.out.println(begin + " " + end);
    }
}
