package localvariables;

public class distance {
    private double distanceInKm;
    private boolean exact;

    public distance(double distanceInKm, boolean exact){
        this.distanceInKm = distanceInKm;
        this. exact = exact;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public boolean isExact() {
        return exact;
    }
}
