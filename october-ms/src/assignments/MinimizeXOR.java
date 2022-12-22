package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinimizeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // nlogn
        int minXor = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int currXor = arr[i] ^ arr[i + 1];
            if (minXor > currXor) {
                minXor = currXor;
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int currXor = arr[i]^arr[j];
        //         if(minXor>currXor){
        //             minXor = currXor;
        //         }
        //     }
        // }
        System.out.println(minXor);

    }
}