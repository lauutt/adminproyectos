package bdd;
import java.util.List;

import bdd.Exceptions.*;
import entidades.Empleado;

public class Servicios {
	
	public static void crearUsuario(Empleado e) throws ServicioExcepcion {
		UsuarioDAO dao = new UsuarioDAOH2Impl();
		try {
			dao.crearEmpleado(e);
		} catch (DBException e1) {
			throw new CrearUsuarioExcepcion("No se pudo crear el usuario", e1);		
		} 
	}

}
