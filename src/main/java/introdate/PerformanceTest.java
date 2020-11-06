package introdate;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance Performance = new Performance("Queen", 1989, 06, 02, 18,00,20, 00);
        System.out.println(Performance.getArtist());
        System.out.println(Performance.getDate());
        System.out.println(Performance.getStartTime());
        System.out.println(Performance.getEndTime());
        System.out.println(Performance.getInfo());
    }
}
