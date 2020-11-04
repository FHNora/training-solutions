package classstructureconstructors;

public class book {
    private String author;
    private String title;
    private String regNumber;

    public book (String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void register(String regNumber) {
     this.regNumber = regNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegNumber() {
        return regNumber;
    }

}
