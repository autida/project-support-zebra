package main.java.org.exceptions;

public class InvalidAttributeException extends RuntimeException{
    private static final long serialVersionUID = -965803075987337372L;

    public InvalidAttributeException() {super();}
    public InvalidAttributeException(String message) {super(message);}
    public InvalidAttributeException(Throwable cause) {super(cause);}
    public InvalidAttributeException(String message, Throwable cause) {super(message, cause);}
}
