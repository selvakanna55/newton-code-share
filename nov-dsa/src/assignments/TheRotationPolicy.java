package assignments;

public class TheRotationPolicy {
    static int RotationPolicy(int A, int B) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (((i - 1) % 2 != 0) && ((i - 1) % 3) != 0) {
                count++;
            }
        }
        return count;
    }
}
