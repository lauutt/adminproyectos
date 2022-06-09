package bdd.Exceptions;

public class IntegerFieldException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerFieldException() {
	}
	
	public IntegerFieldException(String message) {
		super(message);
	}
	
	public IntegerFieldException(String message, Throwable cause) {
		super(message, cause);
	}

}
