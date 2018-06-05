package airport_challenge;

public class AirportException extends Exception {
    public AirportException() {

    }

    AirportException(String message) {
        super (message);
    }

    public AirportException(Throwable cause) {
        super (cause);
    }

    public AirportException(String message, Throwable cause) {
        super (message, cause);
    }
}
