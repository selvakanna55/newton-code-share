package Assignments;

public class IceCream {
    static int Icecreams(int N, int D) {
        for (int i = 1; i <= D; i++) {
            int eat = N / 2;
            int remain = N - eat;
            N = remain * 3;
        }
        return N;
    }
}
