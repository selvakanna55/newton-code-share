package revision_dsa1;


class SortAnArrayOf0s1sAnd2s {
    public static void sort012(int a[], int n) {
        int zeroCount = 0, oneCount = 0, twoCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeroCount++;
            } else if (a[i] == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        int i = 0;
        while (zeroCount-- > 0) {
            a[i] = 0;
            i++;
        }
        while (oneCount-- > 0) {
            a[i] = 1;
            i++;
        }
        while (twoCount-- > 0) {
            a[i] = 2;
            i++;
        }
    }
}