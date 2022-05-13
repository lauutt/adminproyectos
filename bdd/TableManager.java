package bdd;
import java.sql.*;



public class TableManager {
	public void createUserTable() throws DBException  {	
		String sql = "CREATE TABLE empleado (id INT PRIMARY KEY AUTO_INCREMENT, nombres VARCHAR(50), apellidos VARCHAR(50), contacto VARCHAR(100), costoHora INT)";
		DBAccess.execute(sql);	
	}
	
	public void dropTable(String tableName) throws DBException {
		String sql = "DROP TABLE "+tableName;
		DBAccess.execute(sql);	
	}

}
