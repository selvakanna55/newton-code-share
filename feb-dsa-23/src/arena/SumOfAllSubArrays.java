package arena;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SumOfAllSubArrays {
    public static long sumSubarray(int arr[], int n) {
        long subarraySum = 0;
        for (int i = 0; i < n; i++) {
            int currSubArraySum = 0;
            for (int j = i; j < n; j++) {
                currSubArraySum = currSubArraySum + arr[j];
                subarraySum += currSubArraySum;
            }
        }
        return subarraySum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + ((long) arr[i] * ((i + 1) * (n - i)));
        }
        System.out.println(sum);
    }
}