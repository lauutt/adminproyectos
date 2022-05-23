package bdd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bdd.Exceptions.DBException;
import entidades.Empleado;


public class UsuarioDAOH2Impl implements UsuarioDAO {
	
	public void crearEmpleado(Empleado unEmpleado) throws DBException  {
		String nombres = unEmpleado.getNombres();
		String apellidos = unEmpleado.getApellidos();
		String contacto = unEmpleado.getContacto();
		Integer costoHora = unEmpleado.getCostoHora();
		String sql = "INSERT INTO empleado (nombres, apellidos, contacto, costoHora) VALUES "
				+ "('" + nombres + "','" + apellidos + "','"+ contacto + "','" + costoHora + "')"; 
		DBAccess.executeUpdate(sql);
	}

	@Override
	public void borrarEmpleado(String idEmpleado) throws DBException  {
		String sql = "DELETE FROM empleado WHERE id='"+idEmpleado+"'";
		DBAccess.executeUpdate(sql);
		
	}

	@Override
	public void actualizaEmpleado(String searchField, String text, Empleado unEmpleado) throws DBException {
		String nombres = unEmpleado.getNombres();
		String apellidos = unEmpleado.getApellidos();
		String contacto = unEmpleado.getContacto();
		Integer costoHora = unEmpleado.getCostoHora();
		String sql = "UPDATE empleado set nombres='"+nombres+"', apellidos='"+apellidos+
				"', contacto='"+ contacto +"', costoHora='"+ costoHora +"' WHERE "+searchField+"='"+text+"';";
		DBAccess.executeUpdate(sql);
		
	}


	@Override
	public List<Empleado> listaTodosLosEmpleados() throws DBException  {
		List<Empleado> resultado = new ArrayList<>();
		String sql = "SELECT * FROM empleado";
		resultado = DBAccess.executeQuery(sql);
		return resultado;
	}
	
	public List<Empleado> listaFiltradaEmpleados(String fieldName, String text) throws DBException {
		String sql = "SELECT * FROM empleado WHERE "+fieldName+"='"+text+"';";
		List<Empleado> resultado = new ArrayList<>();
		resultado = DBAccess.executeQuery(sql);
		return resultado;
	}




}
