package bdd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarraMenu extends JMenuBar {

	private PanelManager manejador;
	
	public BarraMenu() {
	}
	
	public void setManejador(PanelManager manejador) {
		this.manejador = manejador;
	}
	
	public void armarBarra() {
		JMenu archivo = new JMenu("Archivo");
		JMenu anidado = new JMenu("Anidado");
		
		JMenuItem salir = new JMenuItem("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manejador.mostrarSalir();
			}
		});
		
		archivo.add(salir);
		
		JMenu paneles = new JMenu("Paneles");
		
		JMenuItem mostrarUnPanel = new JMenuItem("Mostrar Panel Uno");
		mostrarUnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				manejador.mostrarInicioPanel();
			}
		});
		
		paneles.add(mostrarUnPanel);
		
		JMenuItem mostrarOtroPanel = new JMenuItem("Mostrar Otro Panel");
		mostrarOtroPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manejador.mostrarPantallaAltaEmpleadoPanel();
			}
		});
		paneles.add(mostrarOtroPanel);

		JMenu interno = new JMenu("interno1");
		JMenuItem opcion =  new JMenuItem("opcion");
		interno.add(opcion);
		anidado.add(interno);



		this.add(archivo);
		this.add(anidado);
		add(paneles);
		
	}

}
