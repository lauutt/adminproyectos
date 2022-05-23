package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
		private static final String DB_DRIVER = "org.h2.Driver";
		private static final String DB_BASE_URL = "jdbc:h2:tcp://localhost/./Users/lautarobarcelo/Documents/UP/Labo1/prueba/mod9/bdd";
		private static final String DB_USERNAME = "sa";
		private static final String DB_PASSWORD = "";

		public static Connection connect() {
			Connection c = null;
			try {
				Class.forName(DB_DRIVER);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.exit(0);
			}
		
			try {
				c = DriverManager.getConnection(DB_BASE_URL, DB_USERNAME, DB_PASSWORD);
				c.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
				System.exit(0);
			}
			return c;
		}

}
