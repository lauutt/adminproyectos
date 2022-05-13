package bdd;
import java.util.List;

public interface UsuarioDAO {
	void crearEmpleado(Empleado unEmpleado) throws DBException ;
	void borrarEmpleado(String idEmpleado) throws DBException ;
	List<Empleado> listaTodosLosEmpleados() throws DBException ;
	List<Empleado> listaFiltradaEmpleados(String fieldName, String text) throws DBException ;
	void actualizaEmpleado(String searchField, String text, Empleado unEmpleado) throws DBException ;
	
}
