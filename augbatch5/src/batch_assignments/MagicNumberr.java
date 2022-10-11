package batch_assignments;

public class MagicNumberr {
    static boolean isMagic(int n) {
        boolean nine = false, seven = false;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            if (lastDigit == 9) nine = true;
            else if (lastDigit == 7) seven = true;
        }
        if (seven && nine) return true;
        return false;
    }

    static int MagicNumber(int N) {

        int forward = N, backward = N;
        while (true) {
            if (isMagic(backward)) {
                return backward;
            } else if (isMagic(forward)) {
                return forward;
            }
            forward++;
            backward--;
        }

    }
}
