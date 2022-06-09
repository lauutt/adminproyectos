package bdd;
import entidades.Empleado;
import bdd.Exceptions.CrearUsuarioExcepcion;
import bdd.Exceptions.DBException;
import bdd.Exceptions.ServicioExcepcion;


public class PantallaEditarEmpleadoPanel extends AbstractPantallaAltaPanel {
	
	
	private Empleado empleadoOrigen;

	public PantallaEditarEmpleadoPanel(PanelManager panelManager) {
		super(panelManager);
	}

	@Override
	public void setCamposPanel() {
		this.camposPanel = new CamposEmpleadoPanel(panelManager);
	}
	
	public void getEditable(Empleado e) {
		this.empleadoOrigen = e;
		CamposEmpleadoPanel camposEmpleadoPanel = (CamposEmpleadoPanel) this.camposPanel;
		camposEmpleadoPanel.getNombresTxt().setText(e.getNombres());
		camposEmpleadoPanel.getApellidosTxt().setText(e.getApellidos());
		camposEmpleadoPanel.getContactoTxt().setText(e.getContacto());
		camposEmpleadoPanel.getCostoTxt().setText(e.getCostoHora().toString());
	}
	

	@Override
	public void ejecutarAccionOk() throws ServicioExcepcion {
		String idOrigen = empleadoOrigen.getId().toString();
		CamposEmpleadoPanel camposEmpleadoPanel = (CamposEmpleadoPanel) this.camposPanel;
        Empleado nuevoEmpleado = new Empleado(camposEmpleadoPanel.getNombresTxt().getText(),
        		camposEmpleadoPanel.getApellidosTxt().getText(),
        		camposEmpleadoPanel.getContactoTxt().getText(),
        		Integer.valueOf(camposEmpleadoPanel.getCostoTxt().getText()));
        UsuarioDAO dao = new UsuarioDAOH2Impl();
		try {
			dao.actualizaEmpleado("id", idOrigen, nuevoEmpleado);
		} catch (DBException e) {
			throw new CrearUsuarioExcepcion("No se pudo actualizar el usuario");
		}
		panelManager.mostrarTablaEmpleadosPanel();
	}

	@Override
	public void ejecutarAccionCancel() {
        CamposEmpleadoPanel camposEmpleadoPanel = (CamposEmpleadoPanel) this.camposPanel;
        camposEmpleadoPanel.getNombresTxt().setText("");
        camposEmpleadoPanel.getApellidosTxt().setText("");
        camposEmpleadoPanel.getContactoTxt().setText("");
        camposEmpleadoPanel.getCostoTxt().setText(""); 
	}
	

}
