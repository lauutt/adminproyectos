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

public class TablaEmpleadosPanel extends JPanel implements ActionListener {

	private JTable tablaEmpleados;
	private EmpleadoTableModel modelo;

	private JScrollPane scrollPaneParaTabla;
	private JButton botonAgregar;
	private JButton botonBorrar;

	public TablaEmpleadosPanel() {
		super();
		armarPanel();
	}

	private void armarPanel() {
		this.setLayout(new FlowLayout());

		modelo = new EmpleadoTableModel();
		tablaEmpleados = new JTable(modelo);
		scrollPaneParaTabla = new JScrollPane(tablaEmpleados);
		this.add(scrollPaneParaTabla);

		botonBorrar = new JButton("BORRAR");
		botonBorrar.addActionListener(this);
		this.add(botonBorrar);

		botonAgregar = new JButton("Cargar fila");
		botonAgregar.addActionListener(this);
		this.add(botonAgregar);
		
		Empleado e1 = new Empleado("guido", "gchiesa", "gchiesa@profes.edu", 123);
		List<Empleado> lista = new ArrayList<Empleado>();
		lista.add(e1);


		modelo.setContenido(lista);

		modelo.fireTableDataChanged();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonAgregar) {
			Random r = new Random();
			int x = r.nextInt(100);
			int dni = r.nextInt(1000) * r.nextInt(1000);

			Empleado e1 = new Empleado("nombre" + x, "test" + x, "mail" + x, dni);

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

}