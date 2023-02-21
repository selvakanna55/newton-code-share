package loops;


class SimpleLoops {
    public static void main(String args[]) {
        System.out.println("for loop start");
        // for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("hello world");
        }
        System.out.println("for loop end");

        System.out.println("while loop start");
        int j = 1;
        while (j <= 3) {
            System.out.println("hello world");
            j++;
        }
        System.out.println("while loop end");


        System.out.println("do while loop start");
        int i = 1;
        do {
            System.out.println("hello world");
            i++;
        } while (i <= 3);
        System.out.println("do while loop end");
    }
}
