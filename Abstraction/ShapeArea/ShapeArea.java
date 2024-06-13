package Abstraction.ShapeArea;

public class ShapeArea {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square sq = new Square(5.5);

        System.out.println("Area Of the Circle is " + Math.round(circle.getAreaOfShape()));
        System.out.println("Area Of the Square is " + Math.round(sq.getAreaOfShape()));
    }
}
