package bdd.Exceptions;

public class CloseConnectionException extends DBException {

	public  CloseConnectionException() {
	}
	
	public  CloseConnectionException(String message) {
		super(message);
	}
	
	public  CloseConnectionException(String message, Throwable cause) {
		super(message, cause);
	}
}
