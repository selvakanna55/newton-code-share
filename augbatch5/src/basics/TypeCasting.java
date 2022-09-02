package basics;

public class TypeCasting {
    public static void main(String[] args) {
        // 10.9 -> 10
        double a = 10.9;
        long b = (long) a;
        System.out.println(a + " " + b);

        //"1" -> 1
        String c = "1";
        int d = Integer.parseInt(c);
        System.out.println(c + " " + d);

        // 1 -> "1"
        int e = 10;
        String f = String.valueOf(e);
        System.out.println(e + " " + f);
    }
}
