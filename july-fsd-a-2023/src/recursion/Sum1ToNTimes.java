package recursion;


class Sum1ToNTimes {
    public static int sumTillN(int i) {
        // TimeComplexity: O(n), SpaceComplexity: O(n)
        if (i <= 3) {
            return i + sumTillN(i + 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int sum = sumTillN(1);
        System.out.println(sum);
        // TimeComplexity: O(n), SpaceComplexity: O(1)


//        System.out.println(sum1ToN(1, n));
    }
}