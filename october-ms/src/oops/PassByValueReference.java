package oops;

public class PassByValueReference {
    static void passByValue(int num) {
        num = num * 10;
        System.out.println("inside passByValue: " + num);
    }

    static void passByRefereace(int arr[]) {
        arr[1] = arr[1] * 10;
        System.out.println("inside passByRefereace: " + arr[1]);

    }

    public static void main(String[] args) {
//        int num = 100;
//        System.out.println("main:" + num);
//        passByValue(num);
//        System.out.println("main:" + num);
        int arr[] = new int[5];
        arr[1] = 100;
        System.out.println("main" + arr[1]);
        passByRefereace(arr);
        System.out.println("main" + arr[1]);

    }
}
