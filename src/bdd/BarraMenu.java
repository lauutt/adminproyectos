package bdd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import bdd.Exceptions.ServicioExcepcion;

public class BarraMenu extends JMenuBar {

	private PanelManager panelManager;
	
	public BarraMenu() {
	}
	
	public void setManejador(PanelManager panelManager) {
		this.panelManager = panelManager;
	}
	
	public void armarBarra() {
		
		JMenu archivo = new JMenu("Archivo");
		JMenu crear = new JMenu("Crear");
		JMenu panelesListas = new JMenu("Ver");
		JMenuItem salir = new JMenuItem("Salir");

		
		JMenuItem crearEmpleado = new JMenuItem("Nuevo Empleado");
		crearEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelManager.mostrarPantallaAltaEmpleadoPanel();
			}
		});
		crear.add(crearEmpleado);
		
		
		JMenuItem crearProyecto = new JMenuItem("Nuevo Proyecto");
		crearProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelManager.mostrarAltaProyectoPanel();	
			}
		});
		crear.add(crearProyecto);
		
		
		JMenuItem crearTarea = new JMenuItem("Nueva Tarea");
		//TODO
		crear.add(crearTarea);
		
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelManager.mostrarSalir();
			}
		});
		archivo.add(salir);
		
		
		JMenuItem verPanelListaEmpleados = new JMenuItem("Empleados");
		verPanelListaEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					panelManager.mostrarTablaEmpleadosPanel();
				} catch (ServicioExcepcion e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panelesListas.add(verPanelListaEmpleados);
		
		
		
		JMenuItem verPanelListaProyectos = new JMenuItem("Proyectos");
		verPanelListaProyectos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelManager.mostrarPantallaAltaEmpleadoPanel();
			}
		});
		panelesListas.add(verPanelListaProyectos);

		

		this.add(archivo);
		this.add(crear);
		add(panelesListas);
		
	}

}
