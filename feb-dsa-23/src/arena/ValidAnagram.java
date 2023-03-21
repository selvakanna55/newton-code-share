package arena;
// https://leetcode.com/problems/valid-anagram/

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        boolean ans = true;
        int arr1[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            arr1[idx] = arr1[idx] + 1;
        }

        int arr2[] = new int[26];
        for (int i = 0; i < t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            arr2[idx] = arr2[idx] + 1;
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                ans = false;
                break;
            }
        }
        return ans;
    }
}
// by rearranging S, if T can be formed?

