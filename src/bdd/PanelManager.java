package bdd;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import bdd.Exceptions.ServicioExcepcion;
import entidades.Empleado;


public class PanelManager {
	
	private JFrame frame;
	private BarraMenu barraMenu;
	private PantallaInicioPanel pantallaInicioPanel;
	private PantallaAltaEmpleadoPanel pantallaAltaEmpleadoPanel;
	private PantallaTablaEmpleadosPanel pantallaTablaEmpleadosPanel;
	private PantallaAltaProyectoPanel pantallaAltaProyectoPanel;
	private PantallaEditarEmpleadoPanel pantallaEditarEmpleadoPanel;

	public PanelManager() {
	}

	public void armarManager() throws ServicioExcepcion {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 550);
		this.barraMenu = new BarraMenu();
		this.barraMenu.armarBarra();
		this.barraMenu.setManejador(this);
		frame.setJMenuBar(barraMenu);
		frame.setTitle("Administrador de Proyectos");
		pantallaInicioPanel = new PantallaInicioPanel(this);	
		pantallaAltaEmpleadoPanel = new PantallaAltaEmpleadoPanel(this);
		pantallaAltaProyectoPanel = new PantallaAltaProyectoPanel(this);
		pantallaEditarEmpleadoPanel = new PantallaEditarEmpleadoPanel(this);
		pantallaTablaEmpleadosPanel = new PantallaTablaEmpleadosPanel(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public void showFrame() {
		frame.setVisible(true);
	}

	public void mostrarSalir() {
		int response = JOptionPane.showConfirmDialog(frame, "¿Desea salir del programa?");
		if (response == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}

	public void mostrarPantallaAltaEmpleadoPanel() {
		mostrarPanel(pantallaAltaEmpleadoPanel);
	}

	public void mostrarInicioPanel() {
		mostrarPanel(pantallaInicioPanel);
		
	}
	
	public void mostrarTablaEmpleadosPanel() throws ServicioExcepcion {
		mostrarPanel(pantallaTablaEmpleadosPanel);
		pantallaTablaEmpleadosPanel.updateTable();
		System.out.println("Hola");
	}

	public void mostrarAltaProyectoPanel() {
		mostrarPanel(pantallaAltaProyectoPanel);
	}
	
	public void mostrarEditarEmpleadoPanel(Empleado e) {
		pantallaEditarEmpleadoPanel.getEditable(e);
		mostrarPanel(pantallaEditarEmpleadoPanel);
	}
	
	public void mostrarPanel(JPanel jPanel) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(jPanel);
		frame.getContentPane().validate();
		frame.getContentPane().repaint();	
	}
	


}
