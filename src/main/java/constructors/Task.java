package constructors;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {
    String title;
    String description;
    LocalDateTime startDateTime;
    LocalTime duration;

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
        return startDateTime;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public LocalDateTime start(LocalDateTime startDateTime){
        this.startDateTime = LocalDateTime.now();
    }
}
