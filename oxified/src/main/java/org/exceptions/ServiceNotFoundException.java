package main.java.org.exceptions;

public class ServiceNotFoundException extends RuntimeException{
    public static final long serialVersionUID = -5380869138817109330L;

    public ServiceNotFoundException() {
        super();
    }

    public ServiceNotFoundException(String message) {
        super(message);
    }

    public ServiceNotFoundException(Throwable cause) {
        super(cause);
    }
    public ServiceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
