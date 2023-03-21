package arena;


class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int curr = num.charAt(i) - '0';
            if (curr % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}