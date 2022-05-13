package bdd;

public class RollbackException extends DBException {

	public  RollbackException() {
	}
	
	public  RollbackException(String message) {
		super(message);
	}
	
	public  RollbackException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
