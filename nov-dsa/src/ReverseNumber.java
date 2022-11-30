public class ReverseNumber {
    public static void main(String[] args) {
        int num = 852; //4321
        int ans = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            ans = (ans * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(ans);
    }
}
