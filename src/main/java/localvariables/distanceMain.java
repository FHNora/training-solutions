package localvariables;

public class distanceMain {
    public static void main(String[] args) {
        distance distance = new distance(4.5, true);
        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int i = (int) distance.getDistanceInKm();
        System.out.println(i);
    }
}
