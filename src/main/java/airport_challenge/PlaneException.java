package airport_challenge;

public class PlaneException extends Exception {
    public PlaneException () {

    }

    PlaneException (String message) {
        super (message);
    }

    public PlaneException (Throwable cause) {
        super (cause);
    }

    public PlaneException (String message, Throwable cause) {
        super (message, cause);
    }
}
