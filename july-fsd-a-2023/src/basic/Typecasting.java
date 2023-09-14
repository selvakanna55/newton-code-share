package basic;

public class Typecasting {
    public static void main(String[] args) {
        int num = 10;
        System.out.println((double) num); //10.0

        double percentage = 77.556; // how to print 77 (integer)
        System.out.println((int) percentage);

        char letter = 'a';
        System.out.println((int) letter);
        System.out.println((char) 120);
        System.out.println((int) letter);
    }
}
