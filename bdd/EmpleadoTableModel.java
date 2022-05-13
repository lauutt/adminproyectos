package bdd;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class EmpleadoTableModel extends AbstractTableModel {
	
	/**
	 * INDICES DE MIS COLUMNAS
	 */
	private static final int COLUMNA_ID = 0;
	private static final int COLUMNA_NOMBRES = 1;
	private static final int COLUMNA_APELLIDOS = 2;
	private static final int COLUMNA_CONTACTO = 3;
	private static final int COLUMNA_COSTOHORA = 4;
	
	/**
	 * NOMBRES DE LOS ENCABEZADOS
	 */
	private String[] nombresColumnas = {"Id", "Nombres", "Apellidos", "Contacto", "Costo por Hora"};
	
	/**
	 * TIPOS DE CADA COLUMNA (EN EL MISMO ORDEN DE LOS ENCABEZADOS)
	 */
	private Class[] tiposColumnas = {String.class, String.class, String.class, String.class, Integer.class};
	

	private List<Empleado> contenido;
	
	/**
	 * CONSTRUCTOR VACIO
	 */
	public EmpleadoTableModel() {
		contenido = new ArrayList<Empleado>();
	}
	
	/**
	 * CONSTRUCTOR CON CONTENIDO INICIAL
	 * @param contenidoInicial
	 */
	public EmpleadoTableModel(List<Empleado> contenidoInicial) {
		contenido = contenidoInicial;
	}

	/**
	 * METODO QUE HAY QUE PISAR
	 */
	public int getColumnCount() {
		return nombresColumnas.length;
	}

	/**
	 * OTRO METODO QUE HAY QUE PISAR
	 */
	public int getRowCount() {
		return contenido.size();
	}
	
	/**
	 * METODO QUE HAY QUE PISAR
	 */
	public String getColumnName(int col) {
        return nombresColumnas[col];
    }

	/**
	 * METODO QUE HAY QUE PISAR
	 */
    public Class getColumnClass(int col) {
        return tiposColumnas[col];
    }
    
	/**
	 * METODO QUE HAY QUE PISAR
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		Empleado u = contenido.get(rowIndex);
		
		Object result = null;
		switch(columnIndex) {
		case COLUMNA_ID:
			result = u.getId();
			break;
		case COLUMNA_NOMBRES:
			result = u.getNombres();
			break;
		case COLUMNA_APELLIDOS:
			result = u.getApellidos();
			break;
		case COLUMNA_CONTACTO:
			result = u.getContacto();
			break;
		case COLUMNA_COSTOHORA:
			result = u.getCostoHora();
			break;			
		default:
			result = new String("");
		}
		
		return result;
	}

    
    /**
     * GETTER DE MIS FILAS
     * @return
     */
    public List<Empleado> getContenido() {
    	return contenido;
    }
    /**
     * SETTER DE MIS FILAS 
     * 
     * @param contenido
     */
    public void setContenido(List<Empleado> contenido) {
    	this.contenido = contenido;
    }
}
