package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator();
        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(CircleCalculator.PI);
        System.out.println(circleCalculator.calculatePerimeter(2.5));
        System.out.println(cylinderCalculator.calculateVolume(3, 4));
        System.out.println(cylinderCalculator.calculateSurfaceArea(2.5,6));

    }
}
