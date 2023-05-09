package main.java.org.exceptions;

public class UserAccntNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 384759547051754150L;

    public UserAccntNotFoundException() {
        super();
    }

    public UserAccntNotFoundException(String message) {
        super(message);
    }

    public UserAccntNotFoundException(Throwable cause) {
        super(cause);
    }
    public UserAccntNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
