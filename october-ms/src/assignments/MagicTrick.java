package assignments;

public class MagicTrick {
    static void magicTrick(int a, int b) {
        int x = 100;
        int sum = x;
        sum = sum + a;
        sum = sum * 2;
        sum = sum + b;
        sum = sum / 2;
        sum = sum - x;
        System.out.println(sum);
    }
}
