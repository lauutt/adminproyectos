package bdd;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import entidades.Proyecto;

public class ProyectoTableModel extends AbstractTableModel {
	
	/**
	 * INDICES DE MIS COLUMNAS
	 */
	private static final int COLUMNA_ID = 0;
	private static final int COLUMNA_TITULO = 1;
	private static final int COLUMNA_DESCRIPCION = 2;

	
	/**
	 * NOMBRES DE LOS ENCABEZADOS
	 */
	private String[] nombresColumnas = {"Id", "Titulo", "Descripción"};
	
	/**
	 * TIPOS DE CADA COLUMNA (EN EL MISMO ORDEN DE LOS ENCABEZADOS)
	 */
	private Class[] tiposColumnas = {Integer.class, String.class, String.class};
	

	private List<Proyecto> contenido;
	
	/**
	 * CONSTRUCTOR VACIO
	 */
	public ProyectoTableModel() {
		contenido = new ArrayList<Proyecto>();
	}
	
	/**
	 * CONSTRUCTOR CON CONTENIDO INICIAL
	 * @param contenidoInicial
	 */
	public ProyectoTableModel(List<Proyecto> contenidoInicial) {
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
		
		Proyecto u = contenido.get(rowIndex);
		
		Object result = null;
		switch(columnIndex) {
		case COLUMNA_ID:
			result = u.getId();
			break;
		case COLUMNA_TITULO:
			result = u.getTitulo();
			break;
		case COLUMNA_DESCRIPCION:
			result = u.getDescripcion();
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
    public List<Proyecto> getContenido() {
    	return contenido;
    }
    /**
     * SETTER DE MIS FILAS 
     * 
     * @param contenido
     */
    public void setContenido(List<Proyecto> contenido) {
    	this.contenido = contenido;
    }
}
