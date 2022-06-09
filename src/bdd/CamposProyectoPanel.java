package bdd;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CamposProyectoPanel extends CamposPanel {
	
	private JTextField tituloTxt;
	private JTextField descripcionTxt;


	public CamposProyectoPanel(PanelManager panelManager) {
		super(panelManager);
	}
	
	public void armarFormulario() {
		this.setLayout(new GridLayout(2,2));

		JLabel tituloLbl = new JLabel("Título:");
		JLabel descripcionLbl = new JLabel("Descripción:");
		tituloTxt = new JTextField("");
		descripcionTxt = new JTextField("");

		this.add(tituloLbl);
		this.add(tituloTxt);
		this.add(descripcionLbl);
		this.add(descripcionTxt);
;
		
	}

	public JTextField getTituloTxt() {
		return tituloTxt;
	}

	public void setTituloTxt(JTextField tituloTxt) {
		this.tituloTxt = tituloTxt;
	}

	public JTextField getDescripcionTxt() {
		return descripcionTxt;
	}

	public void setDescripcionTxt(JTextField descripcionTxt) {
		this.descripcionTxt = descripcionTxt;
	}
	

}
