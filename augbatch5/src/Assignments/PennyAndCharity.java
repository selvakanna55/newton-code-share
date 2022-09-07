package Assignments;

public class PennyAndCharity {
    static int Charity(int N, int M) {
        int given = M / N;
        if (given > 1) {
            return given;
        } else {
            return -1;
        }
    }
}
