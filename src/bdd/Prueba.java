package bdd;
import javax.swing.JFrame;
import bdd.Exceptions.DBException;
import bdd.Exceptions.ServicioExcepcion;


public class Prueba {
	private PanelManager manager;
	public static void main(String[] args) throws DBException, ServicioExcepcion  {
			
		Prueba ppal = new Prueba();
		ppal.iniciarManager();
		ppal.mostrarFrame();
		}
			
		public void iniciarManager() throws ServicioExcepcion {
			manager = new PanelManager();
			manager.armarManager();
			manager.mostrarInicioPanel();
		}
	
		public void mostrarFrame() {
			manager.showFrame();
		}	
		
	}
	
	
	


