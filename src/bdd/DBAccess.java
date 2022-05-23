package bdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bdd.Exceptions.CloseConnectionException;
import bdd.Exceptions.DBException;
import bdd.Exceptions.ExecuteException;
import bdd.Exceptions.ExecuteQueryException;
import bdd.Exceptions.ExecuteUpdateException;
import bdd.Exceptions.RollbackException;
import entidades.Empleado;

public class DBAccess {
	
	public static void closeConnection(Connection c) throws DBException {
		try {
			c.close();
		} catch (SQLException el) {
			throw new CloseConnectionException("La conexión no se pudo cerrar");
		} 
	}
	
	public static void rollbackDB(Connection c, Exception e) throws DBException  {
		try {
			c.rollback();
			e.printStackTrace();
		} catch (SQLException el) {
			throw new RollbackException("No se pudo realizar el rollback de la DB");
		} 
	}
	
	public static void executeUpdate(String sql) throws DBException  {
		Connection c = DBManager.connect();
		try {
			Statement s = c.createStatement();
			s.executeUpdate(sql);
			c.commit();
		} catch (SQLException e) {
			DBAccess.rollbackDB(c, e);
			throw new ExecuteUpdateException("No se pudo actualizar la DB");
		} finally {
			DBAccess.closeConnection(c);
		}
	}
	
	public static List<Empleado> executeQuery(String sql) throws DBException {
		List<Empleado> resultado = new ArrayList<>();
		Connection c = DBManager.connect();
		try {
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String nombresEmpleado = rs.getString("nombres");
				String apellidosEmpleado = rs.getString("apellidos");
				String contactoEmpleado = rs.getString("contacto");
				Integer costoHoraEmpleado = rs.getInt("costoHora");
				Empleado em = new Empleado(id, nombresEmpleado, apellidosEmpleado, contactoEmpleado, costoHoraEmpleado);
				System.out.println(em);
				resultado.add(em);
			}
		} catch (SQLException e) {
			DBAccess.rollbackDB(c, e);
			throw new ExecuteQueryException("No se pudo realizar la consulta a la DB");
		} finally {
			DBAccess.closeConnection(c);
		}

		return resultado;
	}
	
	public static void execute(String sql) throws DBException  {
		Connection c = DBManager.connect();
		try {
			Statement s = c.createStatement();
			s.execute(sql);
		} catch (SQLException e) {
			DBAccess.rollbackDB(c, e);
			throw new ExecuteException("No se pudo realizar la ejecución sobre la DB");
		} finally {
			DBAccess.closeConnection(c);
		}
	}
	
	
}
