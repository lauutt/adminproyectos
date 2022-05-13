package bdd;

public class ExecuteUpdateException extends ExecuteException{
	public  ExecuteUpdateException() {
	}
	
	public  ExecuteUpdateException(String message) {
		super(message);
	}
	
	public  ExecuteUpdateException(String message, Throwable cause) {
		super(message, cause);
	}
}
