import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.utils.Calculator;

public class HelloMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        double circleArea = Calculator.calculateArea(circle);
        double rectangleArea = Calculator.calculateArea(rectangle);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
