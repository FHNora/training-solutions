package immutable;

public class CelestialCoordinates {

    private final CelestialCoordinates celestialCoordinatesCoordinates;
    private final CelestialCoordinates destinationCoordinates;

    public CelestialCoordinates(CelestialCoordinates celestialCoordinates, CelestialCoordinates destinationCoordinates) {
        this.celestialCoordinatesCoordinates = celestialCoordinates;
        this.destinationCoordinates = destinationCoordinates;
    }

    public CelestialCoordinates getCelestialCoordinatesCoordinates() {
        return celestialCoordinatesCoordinates;
    }

    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public String toString() {

    }
}
