package batch_assignments;

class IntegerToRoman {
    public String intToRoman(int num) {
        String roman[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int nums[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String s = "";
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            while (num >= nums[i]) {
                s += roman[i];
                num -= nums[i];
            }
        }
        return s;
    }
}