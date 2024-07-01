package exceptions;

public class InvalidCepException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidCepException(String message) {
        super(message);
    }
	
	public InvalidCepException() {}
}
