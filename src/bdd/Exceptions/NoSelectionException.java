package bdd.Exceptions;

public class NoSelectionException extends Exception {
	
	public NoSelectionException() {
	}
	
	public NoSelectionException(String message) {
		super(message);
	}
	
	public NoSelectionException(String message, Throwable cause) {
		super(message, cause);
	}

}
