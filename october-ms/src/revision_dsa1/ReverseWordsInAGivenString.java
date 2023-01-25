package revision_dsa1;


public class ReverseWordsInAGivenString {
    void reverse(char arr[], int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //Function to reverse words in a given string.
    String reverseWords(String S) {
        char arr[] = S.toCharArray();
        int start = 0;
        int n = arr.length;
        for (int end = 0; end < n; end++) {
            if (arr[end] == '.') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        reverse(arr, start, n - 1);
        reverse(arr, 0, n - 1);
        String res = new String(arr);
        return res;
    }
}