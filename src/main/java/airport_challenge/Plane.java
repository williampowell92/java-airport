package airport_challenge;

class Plane {
    private boolean isFlying = true;

    boolean isFlying() {
        return isFlying;
    }

    void land() throws PlaneException {
        if (!isFlying) throw new PlaneException("Plane already landed");

        isFlying = false;
    }

    void takeOff() throws PlaneException {
        if (isFlying) throw new PlaneException("Plane already flying");

        isFlying = true;
    }
}
