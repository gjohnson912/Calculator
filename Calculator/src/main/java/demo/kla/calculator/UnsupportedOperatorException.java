package demo.kla.calculator;

/**
 * Used when an operator is attempted, but is not supported.
 */
@SuppressWarnings("serial")
public class UnsupportedOperatorException extends RuntimeException {

	/**
	 * Allows for specifying a message indicating what caused the issue.
	 * 
	 * @param message a message indicating what went wrong
	 */
	public UnsupportedOperatorException(String message) {
		super(message);
	}
	
	/**
	 * Allows for specifying a message with the {@link Throwable} that initially caused the issue.
	 * 
	 * @param message a human readable message
	 * @param cause the {@link Throwable} that caused this exception to be created
	 */
	public UnsupportedOperatorException(String message, Throwable cause) {
		super(message, cause);
	}
}
