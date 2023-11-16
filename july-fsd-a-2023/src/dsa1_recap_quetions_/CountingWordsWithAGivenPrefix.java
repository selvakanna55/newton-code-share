package dsa1_recap_quetions_;

// https://leetcode.com/problems/counting-words-with-a-given-prefix/
class CountingWordsWithAGivenPrefix {
    public boolean startsWith(String word, String prefix) {
        int wordLength = word.length();
        int prefixLength = prefix.length();
        if (prefixLength > wordLength) {
            return false;
        }

        boolean ans = true;
        for (int i = 0; i < prefixLength; i++) {
            if (word.charAt(i) != prefix.charAt(i)) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            // if(words[i].startsWith(pref)){
            if (startsWith(words[i], pref)) {
                count++;
            }
        }
        return count;
    }
}

// how many words stats with given pref string
// without using startsWith funciton?