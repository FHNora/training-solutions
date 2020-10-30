package classstructuremethods;

public class noteMain {
    public static void main(String[] args) {
        note note = new note();
        note.setName("Petőfi Sándor");
        System.out.println(note.getName());

        note.setTopic("Szeptember végén");
        System.out.println(note.getTopic());

        note.setText("Még nyílnak a völgyben a kerti virágok,\n" +
                "Még zöldel a nyárfa az ablak előtt,");
        System.out.println(note.getText());

        System.out.println(note.getNoteText());
    }
}
