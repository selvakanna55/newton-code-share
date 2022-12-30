class AddStrings {
    public String addStrings(String num1, String num2) {
        String ans = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int a = 0;
            int b = 0;
            if (i >= 0) {
                a = num1.charAt(i) - '0';
            }
            if (j >= 0) {
                b = num2.charAt(j) - '0';
            }
            int sum = a + b + carry;
            char digit = (char) ('0' + (sum % 10));
            ans = digit + ans;
            carry = sum / 10;
            j--;
            i--;
        }
        if (carry > 0) {
            char digit = (char) ('0' + (carry));
            ans = digit + ans;
        }
        return ans;
    }
}