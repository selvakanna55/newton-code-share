package recursion;


//Sir how to convert 3 string of 3 characters to 2d array of 3*3


class BasicPrinterWithParams {
    public static void printHai(int i, int n) {
        System.out.print(i + " ");
        if (i > n) return;
        printHai(i + 1, n);
    }

    public static void main(String args[]) {
        System.out.println("start");
        printHai(1, 3);
        System.out.println("end");
    }
}