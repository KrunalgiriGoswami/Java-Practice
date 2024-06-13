package Abstraction.ShapeArea;

public class Square extends Shape1{

    private final double sideOfSquare;

    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public double getRadiosOfCircle() {
        return sideOfSquare;
    }

    @Override
    public double getAreaOfShape() {
        return Math.PI * Math.pow(sideOfSquare, 2);
    }

}
