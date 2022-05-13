package bdd;
import javax.swing.JFrame;

public class Prueba {
	public static void main(String[] args) throws DBException  {
/*		Empleado dos = new Empleado();
		dos.setApellidos("Rafetos");
		dos.setContacto("meffreto@colochono.com");
		dos.setCostoHora(10);
		dos.setNombres("Romo");
		UsuarioDAO dao = new UsuarioDAOH2Impl();
		Ventana.Pruebita(dos.getApellidos(), dos.getNombres());		
*/

		JFrame j = new JFrame("Prueba Tablas");
		j.getContentPane().add(new TablaEmpleadosPanel());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.pack();
		j.setVisible(true);



		
		//TableManager tm = new TableManager();
		//tm.dropTable("empleado");
		//tm.createUserTable();
		
		//UsuarioDAO dao = new UsuarioDAOH2Impl();
		
		
		
	}
	
	
	

}
