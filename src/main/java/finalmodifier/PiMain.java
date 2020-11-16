package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator(3);
        CylinderCalculator cylinderCalculator = new CylinderCalculator(3);
        System.out.println(CircleCalculator.PI);
        System.out.println(circleCalculator.calculatePerimeter(2.5));
        System.out.println(cylinderCalculator.calculateVolume());

    }
}
