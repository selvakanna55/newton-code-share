package strings;

class Palindrome {
    public static void main(String args[]) {
        String s1 = "racecar";
        int n = s1.length();

        int i = 0, j = n - 1;
        boolean ans = true;
        while (i < j) {
            char ch1 = s1.charAt(i);
            char ch2 = s1.charAt(j);
            if (ch1 != ch2) {
                ans = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ans);


    }
}
