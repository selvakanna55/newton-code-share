package dsa1_recap_quetions_;

// https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
class ReverseWordsInAGivenString {
    void reverse(char arr[], int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    //Function to reverse words in a given string.
    String reverseWords(String S) {
        char arr[] = S.toCharArray();
        int n = arr.length;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '.') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
        reverse(arr, start, n - 1);
        reverse(arr, 0, n - 1);
        return new String(arr);
    }
}