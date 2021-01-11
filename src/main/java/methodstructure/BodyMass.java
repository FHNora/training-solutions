package methodstructure;

public class BodyMass {

    private int weight;
    private  int height;

    public BodyMass(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double bodyMassIndex() {
        return (weight / height*height);
    }

    public BmiCategory body() {

    }

    public boolean isThinnerThan(BodyMass) {
        if (
    }
}
