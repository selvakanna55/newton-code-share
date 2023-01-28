package revision_dsa1;


class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n % 3 == 0 && n > 1) {
            n = n / 3;
        }
        return n == 1;
    }
}