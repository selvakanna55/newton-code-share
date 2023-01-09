package recursion;

public class RecursionBasic1 {
    static int count = 0;

    static void print() {
        if (count == 3) {
            return;
        }
        System.out.println("ok");
        count++;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}

