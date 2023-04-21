package loops;


class LoopsExample {
    public static void main(String args[]) {
        int n = 3;
        System.out.println("start");

        for (int i = 1; i <= n; i++) {
            System.out.println("hi");
        }


        int i = 1;

        while (i <= n) {
            System.out.println("hi");
            i++;
        }

        i = 1;
        do {
            System.out.println("hi");
            i++;
        } while (i <= n);


        System.out.println("end");

    }
}
// dont repeat code

// can you print hi 10 times?
// can you print hi 10000 times?
