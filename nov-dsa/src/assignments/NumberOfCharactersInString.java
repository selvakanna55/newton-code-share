package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class NumberOfCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();
        int arr[] = new int[26];
        // 0 ->a. 1->b, 2->c ...
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            arr[ch - 'a']++;
        }
        int uniq = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                uniq++;
            }
        }
        System.out.println(uniq);
    }
}