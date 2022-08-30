package Assignments;


import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AreaOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        int area = side * side;
        System.out.println(area);
    }
}