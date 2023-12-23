package dsa1_recap_quetions_;


public class PalindromeTwoPointer {
    public static void main(String[] args) {
        int arr[] = {10, 11, 12, 11, 10};
        int n = arr.length;

        int left = 0, right = n - 1;
        boolean ans = true;
        while (right + 1 != left && left != right) { //left<right
            if (arr[left] != arr[right]) {
                ans = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(ans);
    }
}