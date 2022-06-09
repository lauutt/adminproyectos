package bdd;
import java.util.List;

import bdd.Exceptions.DBException;
import entidades.Empleado;
import entidades.Proyecto;

public interface UsuarioDAO {
	void crearEmpleado(Empleado unEmpleado) throws DBException ;
	void borrarEmpleado(String idEmpleado) throws DBException ;
	List<Empleado> listaTodosLosEmpleados() throws DBException ;
	List<Empleado> listaFiltradaEmpleados(String fieldName, String text) throws DBException ;
	void actualizaEmpleado(String searchField, String text, Empleado unEmpleado) throws DBException ;
	void crearProyecto(Proyecto unProyecto) throws DBException;
	
}
