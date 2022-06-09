package bdd;

import javax.swing.*;

import bdd.Exceptions.ServicioExcepcion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaInicioPanel extends JPanel {

    protected PanelManager panelManager;

    private JButton verListaEmpleadosBtn;
    private JButton crearEmpleadoBtn;
	private JButton crearProyectoBtn;

    public PantallaInicioPanel(PanelManager panelManager) {
        this.panelManager = panelManager;
        this.armarPantallaPanel();
    }

    public void armarPantallaPanel() {
        this.setLayout(new FlowLayout());
        this.verListaEmpleadosBtn = new JButton("Lista de empleados");
        this.crearProyectoBtn = new JButton("Alta nuevo proyecto");
        this.crearEmpleadoBtn = new JButton("Alta nuevo empleado");
        this.add(verListaEmpleadosBtn);
        this.add(crearEmpleadoBtn);
        this.add(crearProyectoBtn);
        

        //escuchar evento del ok, mandar a grabar
        this.verListaEmpleadosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
					panelManager.mostrarTablaEmpleadosPanel();
				} catch (ServicioExcepcion e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        
        this.crearEmpleadoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelManager.mostrarPantallaAltaEmpleadoPanel();
				
			}
		});
        
        this.crearProyectoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelManager.mostrarAltaProyectoPanel();
			}
		});



    }
}