package array;


import java.util.Arrays;

class Sort012 {

    public static void main(String args[]) {
        int arr[] = {0, 1, 2, 0, 1, 1, 0};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeroCount++;
            else if (arr[i] == 1) oneCount++;
            else twoCount++;
        }
        System.out.println("zeroCount " + zeroCount);
        System.out.println("oneCount " + oneCount);
        System.out.println("twoCount " + twoCount);

        int j = 0;
        for (int i = 1; i <= zeroCount; i++) {
            arr[j] = 0;
            j++;
        }
        for (int i = 1; i <= oneCount; i++) {
            arr[j] = 1;
            j++;
        }
        for (int i = 1; i <= twoCount; i++) {
            arr[j] = 2;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}


// int arr[] = {0,1,2,0,1,2,2,1,1,0,2};
// int arr[] = {10,14,-6,21,3,-9,-31,-1,4,6};