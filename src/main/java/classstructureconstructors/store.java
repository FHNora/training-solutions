package classstructureconstructors;

public class store {
    private String product;
    private int stock;

    public store(String product){
        this.product = product;
        stock = 0;
    }

    public void store(int amount){
        stock+=amount;
    }

    public void dispatch(int amount){
        stock-=amount;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
