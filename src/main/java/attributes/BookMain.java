package attributes;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("A kis herceg");
        book.setTitle("Vuk");
        System.out.println(book.getTitle());
    }
}
