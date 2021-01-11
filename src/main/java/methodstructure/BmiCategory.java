package methodstructure;

public enum BmiCategory {

    UNDERWEIGHT(< 18.5), OVERWEIGHT( 25.0), NORMAL;

    private double bmi;

    BmiCategory(double bmi) {
        this.bmi = bmi;
    }

    public double getBmi() {
        return bmi;
    }
}
