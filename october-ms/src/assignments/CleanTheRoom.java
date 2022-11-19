package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CleanTheRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            System.out.println(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (ans < count) {
                ans = count;
            }
        }
        System.out.println(ans);
    }
}


// 0101
// 1000
// 1111
// 0101

// // 1-> clean
// // 0-> dirty