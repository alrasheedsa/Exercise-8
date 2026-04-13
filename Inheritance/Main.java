package org.Inheritance;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape("green", true);
        Circle c1 = new Circle("blue", true, 2.5);
        Rectangle r1 = new Rectangle("yellow", false, 2, 4);
        Square sq = new Square(3, "green", true);

        System.out.println("Shape ");
        System.out.println(s1);

        System.out.println("\nCircle ");
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());

        System.out.println("\nRectangle ");
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());

        System.out.println("\nSquare ");
        System.out.println(sq);
        System.out.println("Area: " + sq.getArea());
        System.out.println("Perimeter: " + sq.getPerimeter());
    }
}