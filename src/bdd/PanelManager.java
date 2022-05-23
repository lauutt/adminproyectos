package bdd;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import bdd.Exceptions.ServicioExcepcion;
import entidades.Empleado;


public class PanelManager {
	
	private JFrame frame;
	private PantallaInicioPanel pantallaInicioPanel;
	private PantallaAltaEmpleadoPanel pantallaAltaEmpleadoPanel;
	private TablaEmpleadosPanel tablaEmpleadosPanel;

	public PanelManager() {
	}

	public void armarManager() throws ServicioExcepcion {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		pantallaInicioPanel = new PantallaInicioPanel(this);	
		pantallaAltaEmpleadoPanel = new PantallaAltaEmpleadoPanel(this);
		tablaEmpleadosPanel = new TablaEmpleadosPanel(this);
		
	}

	public void showFrame() {
		frame.setVisible(true);
	}

	public void mostrarSalir() {
		int response = JOptionPane.showConfirmDialog(frame, "Esta seguro?");
		if (response == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}



	public void mostrarPantallaAltaEmpleadoPanel() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(pantallaAltaEmpleadoPanel);
		frame.getContentPane().validate();//RE-dispongo los elementos segun el layout
		frame.getContentPane().repaint();//RE-pinto los elementos dispuestos en el paso anterior
	}



	public void mostrarInicioPanel() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(pantallaInicioPanel);
		frame.getContentPane().validate();//RE-dispongo los elementos segun el layout
		frame.getContentPane().repaint();
		
	}
	
	public void mostrarTablaEmpleadosPanel() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(tablaEmpleadosPanel);
		frame.getContentPane().validate();//RE-dispongo los elementos segun el layout
		frame.getContentPane().repaint();
	}
	


}
