package recursion;

public class SumOfNMethod2 {

    public static int sum(int num) {
        if (num == 0) return 0;
        int ans = num + sum(num - 1);
        return ans;
    }

    public static int fact(int num) {
        if (num == 0) return 1;
        int ans = num * fact(num - 1);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fact(6)); //1*2*3*4*5
    }
}
