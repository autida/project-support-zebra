package main.java.org.exceptions;

/**
 * Exception to throw when a given playlist ID is not found in the database.
 */
public class BookingNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 8582750526857641132L;

    /**
     * Exception with no message or cause.
     */
    public BookingNotFoundException() {
        super();
    }

    /**
     * Exception with a message, but no cause.
     * @param message A descriptive message for this exception.
     */
    public BookingNotFoundException(String message) {
        super(message);
    }

    /**
     * Exception with no message, but with a cause.
     * @param cause The original throwable resulting in this exception.
     */
    public BookingNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * Exception with message and cause.
     * @param message A descriptive message for this exception.
     * @param cause The original throwable resulting in this exception.
     */
    public BookingNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
