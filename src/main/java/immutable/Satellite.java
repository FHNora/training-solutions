package immutable;

public class Satellite {

    private final CelestialCoordinates destinationCoordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        this.destinationCoordinates = destinationCoordinates;
        this.registerIdent = registerIdent;
    }
}
