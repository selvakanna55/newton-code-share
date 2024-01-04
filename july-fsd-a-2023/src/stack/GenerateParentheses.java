package stack;


import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/
class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        char arr[] = new char[n * 2];
        arr[0] = '(';
        generate(1, 0, n, li, arr, 1);
        return li;
    }

    private void generate(int open, int close, int n, List<String> li, char arr[], int idx) {
        if (idx == 2 * n) {
            li.add(new String(arr));
            return;
        }
        if (close < open) { //more openinhg close
            arr[idx] = ')';
            generate(open, close + 1, n, li, arr, idx + 1);
        }
        if (open + 1 <= n) { //add more opening
            arr[idx] = '(';
            generate(open + 1, close, n, li, arr, idx + 1);
        }
    }
}