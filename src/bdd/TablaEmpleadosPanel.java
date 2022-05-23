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

import bdd.Exceptions.DBException;
import bdd.Exceptions.ServicioExcepcion;
import entidades.Empleado;


public class TablaEmpleadosPanel extends JPanel {
	protected PanelManager panelManager;
	private JTable tablaEmpleados;
	private EmpleadoTableModel modelo;
	private JScrollPane scrollPaneParaTabla;


	public TablaEmpleadosPanel(PanelManager panelManager) throws ServicioExcepcion {
		super();
		this.panelManager = panelManager;
		armarPanel();
	}

	private void armarPanel() throws ServicioExcepcion {
		

		
		this.setLayout(new FlowLayout());
		modelo = new EmpleadoTableModel();
		tablaEmpleados = new JTable(modelo);
		scrollPaneParaTabla = new JScrollPane(tablaEmpleados);
		this.add(scrollPaneParaTabla);
/*
		botonBorrar = new JButton("BORRAR");
		botonBorrar.addActionListener(this);
		this.add(botonBorrar);

		botonAgregar = new JButton("Cargar fila");
		botonAgregar.addActionListener(this);
		this.add(botonAgregar);
		this.add(nombre);
*/
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




		modelo.setContenido(lista);

		modelo.fireTableDataChanged();

	}
/*
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonAgregar) {
			Empleado e1 = new Empleado("Pirolo", "Kraussel", "germancissto@gmail.com", 45);
			try {
				Servicios.crearUsuario(e1);
			} catch (ServicioExcepcion e2) {
				e2.printStackTrace();
			}
			modelo.getContenido().add(e1);

			modelo.fireTableDataChanged();

		} else if(e.getSource() == botonBorrar) {

			int filaSeleccionada = this.tablaEmpleados.getSelectedRow();

			Empleado em = this.modelo.getContenido().get(filaSeleccionada);
			
			System.out.println(em);
			
			this.modelo.getContenido().remove(filaSeleccionada);

			modelo.fireTableDataChanged();
		} 
	}
*/
}