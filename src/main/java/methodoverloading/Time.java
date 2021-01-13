package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;
    private Time time;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.time = time;
    }

    public boolean isEqual(Time time) {
        if (time.equals(time)) {
            return true;
        }
        return false;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
