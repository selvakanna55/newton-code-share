package loop;

public class LoopsAllType {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println("hello");
        }

        int i = 1;
        while (i <= 5) {
            System.out.println("hello");
            i = i + 1;
        }


        int num = 1;
        do {
            System.out.println("hello");
            num = num + 1;
        } while (num <= 3);

    }
}
