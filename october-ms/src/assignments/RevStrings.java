package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RevStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = word.length();
        // for(int i=n-1;i>=0;i--){
        //     System.out.print(word.charAt(i));
        // }

        char arr[] = word.toCharArray();     //abc -> [a,b,c]

        for (int i = 0; i < n / 2; i++) {
            int idx1 = i;
            int idx2 = n - i - 1;
            char temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;
        }
        // String reversed = new String(arr);  //[a,b,c] -> abc
        // System.out.println(reversed);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}