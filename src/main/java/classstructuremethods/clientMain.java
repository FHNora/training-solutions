package classstructuremethods;

public class clientMain {
    public static void main(String[] args) {
        client client = new client ();
        client.setName("John Doe");
        System.out.println(client.getName());

        client.setYear(1980);
        System.out.println(client.getYear());

        client.setAddress("200 Main Street Phoenix 28700");
        System.out.println(client.getAddress());

    }
}

