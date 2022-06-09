package bdd.Exceptions;

public class TextoVacioExcepcion extends TextoExcepcion{
	public TextoVacioExcepcion() {
	}
	
	public TextoVacioExcepcion(String message) {
		super(message);
	}
	
	public TextoVacioExcepcion(String message, Throwable cause) {
		super(message, cause);
	}

}
