package bdd.Exceptions;

public class TextoExcepcion extends Exception{
	public TextoExcepcion() {
	}
	
	public TextoExcepcion(String message) {
		super(message);
	}
	
	public TextoExcepcion(String message, Throwable cause) {
		super(message, cause);
	}

}
