package assignments;

public class DoraemonAndBigLight {
    static boolean EqualOrNot(int h1, int h2, int v1, int v2) {
        return v1 != v2 && (h1 - h2) % (v2 - v1) == 0;
    }
}
