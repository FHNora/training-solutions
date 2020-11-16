package finalmodifier;

public class CylinderCalculator {

    public double calculateVolume(double r, int h){
        return CircleCalculator.PI * r * r * h;
    }

    public double calculateSurfaceArea(double r, int h){
        return CircleCalculator.PI * 2 * r * (r + h);
    }
}
