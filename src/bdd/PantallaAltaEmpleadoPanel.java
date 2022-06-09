package bdd;

import javax.swing.JOptionPane;

import bdd.Exceptions.CrearUsuarioExcepcion;
import bdd.Exceptions.DBException;
import bdd.Exceptions.ServicioExcepcion;
import bdd.Exceptions.TextoExcepcion;
import entidades.Empleado;
import util.Validaciones;

public class PantallaAltaEmpleadoPanel extends AbstractPantallaAltaPanel {
	
    public PantallaAltaEmpleadoPanel(PanelManager panelManager) {
        super(panelManager);
    }

    @Override
    public void setCamposPanel() {
        this.camposPanel = new CamposEmpleadoPanel(panelManager);
    }


    @Override
    public void ejecutarAccionOk() throws ServicioExcepcion {
    	altaDatos();
    }

    @Override
    public void ejecutarAccionCancel() {
    	borrarDatos();
    }

    
    public void borrarDatos() {
        CamposEmpleadoPanel camposEmpleadoPanel = (CamposEmpleadoPanel) this.camposPanel;
        camposEmpleadoPanel.getNombresTxt().setText("");
        camposEmpleadoPanel.getApellidosTxt().setText("");
        camposEmpleadoPanel.getContactoTxt().setText("");
        camposEmpleadoPanel.getCostoTxt().setText("");      
    }
    
    public void altaDatos() throws ServicioExcepcion {
        CamposEmpleadoPanel camposEmpleadoPanel = (CamposEmpleadoPanel) this.camposPanel;
        try {
        	Validaciones.validarTexto(camposEmpleadoPanel.getNombresTxt().getText());
        	Validaciones.validarTexto(camposEmpleadoPanel.getApellidosTxt().getText());
        	Validaciones.validarTexto(camposEmpleadoPanel.getContactoTxt().getText());
        	Validaciones.validarTexto(camposEmpleadoPanel.getCostoTxt().getText());
        	Validaciones.validarNumero(camposEmpleadoPanel.getCostoTxt().getText()); 	
            Empleado nuevoEmpleado = new Empleado(camposEmpleadoPanel.getNombresTxt().getText(),
            		camposEmpleadoPanel.getApellidosTxt().getText(),
            		camposEmpleadoPanel.getContactoTxt().getText(),
            		Integer.valueOf(camposEmpleadoPanel.getCostoTxt().getText()));
            UsuarioDAO dao = new UsuarioDAOH2Impl();
    		try {
    			dao.crearEmpleado(nuevoEmpleado);
    		} catch (DBException e) {
    			throw new CrearUsuarioExcepcion("No se pudo crear el usuario");
    		}
    		panelManager.mostrarTablaEmpleadosPanel();
        	
        } catch (TextoExcepcion e) {
        	JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        

    }
    
}
