package arena;


class DoubleMultiplication {
    long solve(long a, double b) {
        long product = a * (long) (b * 100); // Compute product and cast to long integer
        return product / 100;
    }
}