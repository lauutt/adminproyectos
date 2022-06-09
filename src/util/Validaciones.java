package util;
import bdd.Exceptions.*;


public class Validaciones {
	
	public static void validarTexto(String texto) throws TextoExcepcion {
		if (texto.length() == 0) {
			throw new TextoVacioExcepcion("El texto esta vacío.");
		}
		if (texto.isBlank()) {
			throw new TextoBlancoExcepcion("El texto está todo en blanco.");
		}
	}
	
	public static void validarNumero(String texto) throws TextoExcepcion {
		try {
			Integer.valueOf(texto);
		} catch (NumberFormatException e) {
			throw new TextoExcepcion("La entrada " + texto + " no es un número.");
		}
	}
	
	
}