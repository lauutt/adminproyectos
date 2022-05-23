package bdd.Exceptions;

public class ServicioExcepcion extends Exception {
	
	public ServicioExcepcion() {
	}
	
	public ServicioExcepcion(String message) {
		super(message);
	}
	
	public ServicioExcepcion(String message, Throwable cause) {
		super(message, cause);
	}
	

}
