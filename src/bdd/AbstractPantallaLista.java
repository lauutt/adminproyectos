package bdd;

import javax.swing.*;

import bdd.Exceptions.NoSelectionException;
import bdd.Exceptions.ServicioExcepcion;
import entidades.Empleado;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public abstract class AbstractPantallaLista extends JPanel {

    protected PanelManager panelManager;
    protected BotoneraPanel botonesPanel;
    

    public AbstractPantallaLista(PanelManager panelManager) {
        this.panelManager = panelManager;
        this.setBotoneraPanel();
        armarPantallaPanel();  
    }

    public void armarPantallaPanel() {
    	this.setLayout(new FlowLayout());
        this.add(botonesPanel);
        this.botonesPanel.getOkBtn().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	seleccionarEditar();
            }
        });

        this.botonesPanel.getCancelBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarAccionCancel();
            }
        });
    }

    private void setBotoneraPanel() {
        this.botonesPanel = new BotoneraPanel(this.panelManager);
        botonesPanel.renameOkBtn("Editar");
        botonesPanel.renameCancelBtn("Borrar entrada");
    }
    
    private void seleccionarEditar() {
        try {
			ejecutarAccionOk();
		} catch (NoSelectionException e1) {
			JOptionPane.showMessageDialog(this, e1, "Error", JOptionPane.ERROR_MESSAGE);
		} 	
    }

    public abstract void ejecutarAccionOk() throws NoSelectionException;
    public abstract void ejecutarAccionCancel();

	public List<Empleado> obtenerTabla() throws ServicioExcepcion {
		return null;
	}




}


