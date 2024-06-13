package Abstraction.ShapeArea;

public class Circle extends Shape1 {

    private final double radiosOfCircle;

    public Circle(double radiosOfCircle) {
        this.radiosOfCircle = radiosOfCircle;
    }

    public double getRadiosOfCircle() {
        return radiosOfCircle;
    }

    @Override
    public double getAreaOfShape() {
        return Math.PI * Math.pow(radiosOfCircle, 2);
    }

}
