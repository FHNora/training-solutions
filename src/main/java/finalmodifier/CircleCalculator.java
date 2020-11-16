package finalmodifier;

public class CircleCalculator {

    public static final double PI = 3.14;
    private double r;

    public double calculatePerimeter(double r){
        return 2 * PI * r;
    }

    public double calculateArea(double r){
        return PI * r * r;
    }
}
