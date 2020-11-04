package classstructureintegrate;

public class product {
    private String name;
    private int price;

    public product (String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int amount){
        price += amount;
    }

    public void decreasePrice(int amount){
        price -= amount;
    }
}
