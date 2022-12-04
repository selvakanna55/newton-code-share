package assignments;

public class SmallerElements {
    static int smallerElements(int a[], int n, int k) {
        int count = 0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] <= k) {
                count = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // for(int i=0;i<n;i++){
        //         if(a[i]<=k){
        //                 count++;
        //         }else{
        //                 break;
        //         }
        // }
        return count;
    }
}