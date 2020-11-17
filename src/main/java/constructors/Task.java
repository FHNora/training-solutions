package constructors;

import java.time.LocalDateTime;

public class Task {
    String title;
    String description;
    LocalDateTime startDateTime;
    int duration;

    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime(){
        return start();
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime start(){
        return LocalDateTime.now();
    }
}
