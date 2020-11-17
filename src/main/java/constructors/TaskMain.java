package constructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Beadandó", "1 oldalas összefoglaló írása");
        task.setDuration(2);
        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        System.out.println(task.start());
        System.out.println(task.getStartDateTime());
        System.out.println(task.getDuration());

    }
}
