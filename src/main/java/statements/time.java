package statements;

public class time {
    private int hour;
    private int minute;
    private int second;

    public time (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes (){
        return hour*60 + minute;
    }

    public int getInSeconds(){
        return hour*3600 + minute*60 + second;
    }

    public boolean earlierThan(time secondTime){
        return secondTime.getInSeconds() > this.getInSeconds();
    }

    public String toString(){
        return hour + ":" + minute + "+" + second;
    }
}
