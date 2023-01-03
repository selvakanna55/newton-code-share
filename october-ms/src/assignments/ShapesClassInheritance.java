package assignments;


//Do not change the name of the class

import java.util.*;

// Do not edit the Quadrilateral class


abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1 + side2 + side3 + side4);
    }
}

class Parallelogram extends Quadrilateral {
    double heightPerpendicularToSide1;

    public Parallelogram(double side1, double side2, double height) {
        super(side1, side2, side1, side2);
        this.heightPerpendicularToSide1 = height;
    }

    public double getArea() {
        return side1 * heightPerpendicularToSide1;
    }
}

class Rhombus extends Parallelogram {
    public Rhombus(double side, double height) {
        super(side, side, height);
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(double length, double breadth) {
        super(length, breadth, breadth);
    }
}

class Square extends Rhombus {
    public Square(double side) {
        super(side, side);
    }
}

// Do not edit the Main class
class ShapesClassInheritance { // TODO: change this class name to Main
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);

        //Rhombus
        double side = scan.nextDouble();
        double heightOfRhombus = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, heightOfRhombus);

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);

        //Square
        double sideOfSquare = scan.nextDouble();
        Square square = new Square(sideOfSquare);

        if (side1 < 0 || side2 < 0 || heightOfRhombus < 0 || height < 0 || side < 0 || length < 0 || breadth < 0 || sideOfSquare < 0) {
            System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
            return;
        }


        System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter() + " and Area of Parallelogram is " + parallelogram.getArea());
        System.out.println("Perimeter of Rhombus is " + rhombus.getPerimeter() + " and Area of Rhombus is " + rhombus.getArea());
        System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter() + " and Area of Rectangle is " + rectangle.getArea());
        System.out.println("Perimeter of Square is " + square.getPerimeter() + " and Area of Square is " + square.getArea());

        scan.close();
    }
}

