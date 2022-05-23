package bdd.Exceptions;

public class ExecuteQueryException extends ExecuteException{
	
	public  ExecuteQueryException() {
	}
	
	public  ExecuteQueryException(String message) {
		super(message);
	}
	
	public  ExecuteQueryException(String message, Throwable cause) {
		super(message, cause);
	}
}
