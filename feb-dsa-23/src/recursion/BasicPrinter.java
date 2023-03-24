package recursion;


//Sir how to convert 3 string of 3 characters to 2d array of 3*3


class BasicPrinter {
    static int i = 1;

    public static void printHai() {
        if (i > 3) {
            return;
        }
        System.out.println("hai");
        i++;
        printHai();
    }

    public static void main(String args[]) {
        System.out.println("start");
        printHai();
        System.out.println("end");
    }
}