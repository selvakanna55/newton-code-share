package revision_dsa1;


class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                return digits;
            }
        }
        int arr[] = new int[n + 1];
        arr[0] = 1;
        return arr;
    }
}