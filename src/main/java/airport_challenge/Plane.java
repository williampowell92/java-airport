package airport_challenge;

public class Plane {
    private boolean isFlying = true;

    public boolean isFlying() {
        return isFlying;
    }

    public void land() throws PlaneException {
        if (!isFlying) throw new PlaneException("Plane already landed");

        isFlying = false;
    }

    public void takeOff() throws PlaneException {
        if (isFlying) throw new PlaneException("Plane already flying");

        isFlying = true;
    }
}
