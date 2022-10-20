package basics;


class LoopsRecap { //class
    public static void main(String[] args) {
        System.out.println("begin");
        int n = 3;
        for (int j = 1; j <= n; j = j + 1) {
            System.out.println("hello");
        }

        int i = 1;
        do {
            System.out.println("hello");
            i = i + 1;
        } while (i <= n);


        int k = 1;
        while (k <= n) {
            System.out.println("hello");
            k = k + 1;
        }

        System.out.println("end");
    }
}
