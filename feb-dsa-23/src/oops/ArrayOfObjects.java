package oops;


public class ArrayOfObjects {
    public static void main(String args[]) {
//         int a[] = new int[5];

        String arr[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        arr[0] = new String("apple");
        arr[1] = new String("orange");
        arr[2] = new String("apple");
        arr[3] = "guva";
        arr[4] = "hkjllkjnfk";

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i].charAt(1) + " ");
        }
    }
}