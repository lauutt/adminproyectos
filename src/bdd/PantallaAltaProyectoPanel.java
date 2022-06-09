package bdd;
import bdd.Exceptions.CrearUsuarioExcepcion;
import bdd.Exceptions.DBException;
import bdd.Exceptions.ServicioExcepcion;

import entidades.Proyecto;

public class PantallaAltaProyectoPanel extends AbstractPantallaAltaPanel {
	
    public PantallaAltaProyectoPanel(PanelManager panelManager) {
        super(panelManager);
    }

    @Override
    public void setCamposPanel() {
        this.camposPanel = new CamposProyectoPanel(panelManager);
    }


    @Override
    public void ejecutarAccionOk() throws ServicioExcepcion {
    	//altaDatos();
        
    }

    @Override
    public void ejecutarAccionCancel() {
    	//borrarDatos();
    }

    
    public void borrarDatos() {
        CamposProyectoPanel camposProyectoPanel = (CamposProyectoPanel) this.camposPanel;
        camposProyectoPanel.getTituloTxt().setText("");
        camposProyectoPanel.getDescripcionTxt().setText("");   
    }
   
    public void altaDatos() throws ServicioExcepcion {
        CamposProyectoPanel camposProyectoPanel = (CamposProyectoPanel) this.camposPanel;
        Proyecto nuevoProyecto = new Proyecto(camposProyectoPanel.getTituloTxt().getText(),
        		camposProyectoPanel.getDescripcionTxt().getText());
        UsuarioDAO dao = new UsuarioDAOH2Impl();
		try {
			dao.crearProyecto(nuevoProyecto);
		} catch (DBException e) {
			throw new CrearUsuarioExcepcion("No se pudo crear el proyecto");
			
		}
		panelManager.mostrarTablaEmpleadosPanel();
        

    }

}
