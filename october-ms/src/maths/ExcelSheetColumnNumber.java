package maths;

class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        // int pow = 1;
        int res = 0;
        int idx = 0;
        int n = columnTitle.length();
        for (int i = n - 1; i >= 0; i--) {
            int curr = (columnTitle.charAt(i) - 'A') + 1;
            res += ((int) Math.pow(26, idx)) * (curr);
            idx++;
        }
        return res;
    }
}