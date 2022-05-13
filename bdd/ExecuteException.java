package bdd;

public class ExecuteException extends DBException{

	public  ExecuteException() {
	}
	
	public  ExecuteException(String message) {
		super(message);
	}
	
	public  ExecuteException(String message, Throwable cause) {
		super(message, cause);
	}
}
