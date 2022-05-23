package bdd;
import javax.swing.JFrame;
import bdd.Exceptions.DBException;
import bdd.Exceptions.ServicioExcepcion;


public class Prueba {
	private PanelManager manager;
	public static void main(String[] args) throws DBException, ServicioExcepcion  {
		
		//TableManager tm = new TableManager();
		//tm.createUserTable();
		
//		Empleado dos = new Empleado();
//		dos.setApellidos("Sarle");
//		dos.setContacto("catrosfel@colochono.com");
//		dos.setCostoHora(20);
//		dos.setNombres("Remiquiades");	
		
		
		
//		UsuarioDAO dao = new UsuarioDAOH2Impl();
//		dao.crearEmpleado(dos);
		
		
/*		
		JFrame j = new JFrame("Prueba Tablas");
		j.getContentPane().add(new TablaEmpleadosPanel(dao.listaTodosLosEmpleados()));
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.pack();
		j.setVisible(true);
		
*/
		
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



		

		
		//UsuarioDAO dao = new UsuarioDAOH2Impl();
		
		
		
	}
	
	
	


