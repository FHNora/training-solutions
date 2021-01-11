package methodvarargs;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        int number = 0;
        for (int r : results) {
            if (r > limitInPercent) {
                number++;
            }
        }
        return number;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        for (int r : results) {
            if (r < limitInPercent) {
                return true;
            }
        }
        return false;
    }
}
