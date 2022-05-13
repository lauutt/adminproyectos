package bdd;

public class ResultadoVacioException extends DBException {
		public ResultadoVacioException() {
		}
		
		public ResultadoVacioException(String message) {
			super(message);
		}
		
		public ResultadoVacioException(String message, Throwable cause) {
			super(message, cause);
		}
		
}
