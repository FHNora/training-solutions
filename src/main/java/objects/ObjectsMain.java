package objects;

public class ObjectsMain {

    public static void main(String[] args) {
        class Book {}

        Book book1 = new Book();
        System.out.println(book1);

        Book emptyBook = null;
        System.out.println(emptyBook);

        if (emptyBook == null){
            System.out.println(true);
        }

        Book book = book1;
        System.out.println(book);

        book = null;
        System.out.println(book);

        Book book2 = new Book();
        book = book2;
        System.out.println(book);

        Book anotherBook = new Book();
        book2 = anotherBook;
        System.out.println(anotherBook);

        if (book == anotherBook){
            System.out.println(true);
        }

        System.out.println(anotherBook instanceof Book);

    }
}
