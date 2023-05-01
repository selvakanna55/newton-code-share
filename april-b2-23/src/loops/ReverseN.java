package loops;

public class ReverseN {
    public static void main(String[] args) {
        int num = 789;
        int ans = 0;
//        for(int num = 789;num>0; num = num /10){
        while (num > 0) {
            int lastDigit = num % 10;
            ans = (ans * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(ans);
    }
}
