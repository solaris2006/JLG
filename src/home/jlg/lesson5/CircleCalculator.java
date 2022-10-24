package home.jlg.lesson5;

public class CircleCalculator implements GeometryCalculator{

    private final double radius;
    private final double diameter;

    public CircleCalculator(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
