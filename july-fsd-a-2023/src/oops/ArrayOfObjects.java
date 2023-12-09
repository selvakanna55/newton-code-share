package oops;


public class ArrayOfObjects {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        Circle c1 = new Circle(10);

        Circle arr[] = new Circle[2];
        arr[0] = c1;
        arr[1] = new Circle(20);

        for (int i = 0; i < arr.length; i++) {
            arr[i].printRadius(); // same as calling c1.printRadius();
        }
        // arr[1].printRadius(); // same as calling c2.printRadius();
    }
}


class Circle {
    int r;

    Circle(int r) {
        this.r = r;
    }

    void printRadius() {
        System.out.println(r);
    }

}