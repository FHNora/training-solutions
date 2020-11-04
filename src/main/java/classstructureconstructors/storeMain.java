package classstructureconstructors;

public class storeMain {
    public static void main(String[] args) {
        store hammers = new store("hammer");
        store screwDrivers = new store("screwdriver");

        hammers.store(25);
        System.out.println(hammers.getStock());
        System.out.println(screwDrivers.getStock());

        screwDrivers.store(12);
        System.out.println(hammers.getStock());
        System.out.println(screwDrivers.getStock());
    }
}
