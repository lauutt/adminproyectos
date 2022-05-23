package bdd;

import bdd.Exceptions.CrearUsuarioExcepcion;
import bdd.Exceptions.DBException;
import bdd.Exceptions.ServicioExcepcion;
import entidades.Empleado;

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
        System.out.println("mando a grabar Empleado");
    }

    @Override
    public void ejecutarAccionCancel() {
    	borrarDatos();
        System.out.println("cancelo y presento lista de Empleados");
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
        System.out.println(nuevoEmpleado);
    }
}
