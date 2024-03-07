package merge_sort;
// https://my.newtonschool.co/playground/code/1dgrqlcxi1mu


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ExploringSubsequences {
    static void printSubseq(String word, int idx, String subseq) {
        if (idx == word.length()) {
            System.out.println(subseq);
            return;
        }
        printSubseq(word, idx + 1, subseq);
        printSubseq(word, idx + 1, subseq + word.charAt(idx));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        printSubseq(word, 0, "");
    }
}
