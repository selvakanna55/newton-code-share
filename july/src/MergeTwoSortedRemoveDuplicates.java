import java.util.Arrays;
import java.util.HashSet;

public class MergeTwoSortedRemoveDuplicates {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6, 6, 7};
        int arr2[] = {1, 2, 5, 7};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int res[] = new int[n1 + n2];

        // merge
        int p1 = 0, p2 = 0, k = 0;
        while (p1 < n1 && p2 < n2) {
            if (arr1[p1] < arr2[p2]) {
                if (k == 0 || res[k - 1] != arr1[p1]) {
                    res[k] = arr1[p1];
                    k++;
                }
                p1++;
            } else {
                if (k == 0 || res[k - 1] != arr2[p2]) {
                    res[k] = arr2[p2];
                    k++;
                }
                p2++;
            }
        }
        while (p1 < n1) {
            if (k == 0 || res[k - 1] != arr1[p1]) {
                res[k] = arr1[p1];
                k++;
            }
            p1++;
        }
        while (p2 < n2) {
            if (k == 0 || res[k - 1] != arr2[p2]) {
                res[k] = arr2[p2];
                k++;
            }
            p2++;
        }
        for(int i=0;i<k;i++){
            System.out.print(res[i]+" ");
        }
//        System.out.println(Arrays.toString(res));
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i = 0; i < res.length; i++) {
//            hs.add(res[i]);
//        }
//        System.out.println(hs);
    }
}
