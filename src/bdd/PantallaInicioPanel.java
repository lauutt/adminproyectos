package bdd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaInicioPanel extends JPanel {

    protected PanelManager panelManager;
    private JButton verListaBtn;
    private JButton crearEmpleadoBtn;

    public PantallaInicioPanel(PanelManager panelManager) {
        this.panelManager = panelManager;
        this.armarPantallaPanel();
    }

    public void armarPantallaPanel() {
        this.setLayout(new FlowLayout());
        this.verListaBtn = new JButton("Lista de empleados");
        this.crearEmpleadoBtn = new JButton("Alta nuevo empleado");

        this.add(verListaBtn);
        this.add(crearEmpleadoBtn);

        //escuchar evento del ok, mandar a grabar
        this.verListaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelManager.mostrarTablaEmpleadosPanel();
            }
        });
        
        this.crearEmpleadoBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panelManager.mostrarPantallaAltaEmpleadoPanel();
				// TODO Auto-generated method stub
				
			}
		});



    }
}