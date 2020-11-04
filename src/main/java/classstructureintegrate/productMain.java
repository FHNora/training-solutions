package classstructureintegrate;

public class productMain {
    public static void main(String[] args) {
        product product = new product("hamburger", 1200);
        System.out.println("Termék: " + product.getName());
        System.out.println("Ára: " + product.getPrice());
        product.increasePrice(200);
        System.out.println("Extra ár: " + product.getPrice());
        product.decreasePrice(600);
        System.out.println("Csökkentett ár: " + product.getPrice());
    }
}
