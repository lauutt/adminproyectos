package bdd;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import bdd.Exceptions.CrearUsuarioExcepcion;
import bdd.Exceptions.DBException;
import bdd.Exceptions.NoSelectionException;
import bdd.Exceptions.ServicioExcepcion;
import entidades.Empleado;


public class PantallaTablaEmpleadosPanel extends AbstractPantallaLista {
	private JTable tablaEmpleados;
	private EmpleadoTableModel modelo;
	private JScrollPane scrollPaneParaTabla;
	public PantallaTablaEmpleadosPanel(PanelManager panelManager) throws ServicioExcepcion {
		super(panelManager);
		armarPanel();
	}

	private void armarPanel() throws ServicioExcepcion {
		this.setLayout(new FlowLayout());
		modelo = new EmpleadoTableModel();
		tablaEmpleados = new JTable(modelo);
		scrollPaneParaTabla = new JScrollPane(tablaEmpleados);
		this.add(scrollPaneParaTabla);
		this.add(botonesPanel);
		
	}
	
	public void updateTable() throws ServicioExcepcion {
		modelo.setContenido(obtenerTabla());
		modelo.fireTableDataChanged();	
	}
	


	@Override
	public void ejecutarAccionOk() throws NoSelectionException {
		int filaSeleccionada = this.tablaEmpleados.getSelectedRow();
		if (filaSeleccionada == -1) {
			throw new NoSelectionException("No se ha seleccionado ninguna fila");
		} else {
			panelManager.mostrarEditarEmpleadoPanel(this.modelo.getContenido().get(filaSeleccionada));
		}
		
		
	}

	@Override
	public void ejecutarAccionCancel() {
		int filaSeleccionada = this.tablaEmpleados.getSelectedRow();
		Empleado e = this.modelo.getContenido().get(filaSeleccionada);
        UsuarioDAO dao = new UsuarioDAOH2Impl();
		try {
			dao.borrarEmpleado(e.getId().toString());;
		} catch (DBException e1) {
			e1.printStackTrace();
		}
		this.modelo.getContenido().remove(filaSeleccionada);
		modelo.fireTableDataChanged();
		
	}

	@Override
	public List<Empleado> obtenerTabla() throws ServicioExcepcion {
		List<Empleado> lista = new ArrayList<Empleado>();
		
		UsuarioDAO dao = new UsuarioDAOH2Impl();
		try {
			List<Empleado> todosEmpleados = dao.listaTodosLosEmpleados();
			for (Empleado em: todosEmpleados) {
				Empleado e1 = new Empleado(em.getId(), em.getNombres(), em.getApellidos(), em.getContacto(), em.getCostoHora());
				lista.add(e1);
			}
		} catch (DBException e) {
			throw new ServicioExcepcion();
		}
		return lista;
	}
	



}