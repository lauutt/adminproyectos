package bdd;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class CamposEmpleadoPanel extends CamposPanel {

	private JTextField nombresTxt;
	private JTextField apellidosTxt;
	private JTextField costoTxt;
	private JTextField contactoTxt;

	public CamposEmpleadoPanel(PanelManager panelManager) {
		super(panelManager);
	}
	
	public void armarFormulario() {
		this.setLayout(new GridLayout(4,4));

		JLabel nombreLbl = new JLabel("Nombres:");
		JLabel apellidoLbl = new JLabel("Apellidos:");
		JLabel contactoLbl = new JLabel("Contacto:");
		JLabel costoLbl = new JLabel("Costo x hora:");
		
		

		nombresTxt = new JTextField("");
		apellidosTxt = new JTextField("");
		contactoTxt = new JTextField("");
		costoTxt = new JTextField("");
		

		this.add(nombreLbl);
		this.add(nombresTxt);
		this.add(apellidoLbl);
		this.add(apellidosTxt);
		this.add(contactoLbl);
		this.add(contactoTxt);
		this.add(costoLbl);
		this.add(costoTxt);
		
	}

	public JTextField getNombresTxt() {
		return nombresTxt;
	}

	public void setNombresTxt(JTextField nombreTxt) {
		this.nombresTxt = nombreTxt;
	}

	public JTextField getApellidosTxt() {
		return apellidosTxt;
	}

	public void setApellidosTxt(JTextField apellidoTxt) {
		this.apellidosTxt = apellidoTxt;
	}
	
	public JTextField getContactoTxt() {
		return contactoTxt;
	}

	public void setContactoTxt(JTextField contactoTxt) {
		this.contactoTxt = contactoTxt;
	}
	
	public JTextField getCostoTxt() {
		return costoTxt;
	}

	public void setCostoTxt(JTextField costoTxt) {
		this.costoTxt = costoTxt;
	}
}
