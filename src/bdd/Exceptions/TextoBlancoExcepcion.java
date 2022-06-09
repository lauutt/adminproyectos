package bdd.Exceptions;

public class TextoBlancoExcepcion extends TextoExcepcion{
	public TextoBlancoExcepcion() {	
	}
	
	public TextoBlancoExcepcion(String message) {
		super(message);
	}
	
	public TextoBlancoExcepcion(String message, Throwable cause) {
		super(message, cause);
	}

}