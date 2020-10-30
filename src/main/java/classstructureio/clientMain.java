package classstructureio;

public class clientMain {

    public static void main(String[] args) {
        client client = new client();
        client.name = "John Doe";
        client.year = 1980;
        client.address = "200 Main Street Phoenix 85123";
        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);
    }

}
