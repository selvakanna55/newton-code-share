package batch_assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SubstringReversal {

    static void reverseWord(char arr[], int st, int en) {
        // System.out.println(st+" "+en);
        while (st <= en) {
            char temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char word[] = sc.next().toCharArray();
        int n = word.length;
        int arr[] = new int[100002];
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int st = sc.nextInt();
            arr[st]++;
            arr[n - st + 2]++;
        }

        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            count += arr[i];
            if (count % 2 == 1) {
                char temp = word[i - 1];
                word[i - 1] = word[n - i];
                word[n - i] = temp;
            }
        }
        System.out.println(new String(word));
    }
}