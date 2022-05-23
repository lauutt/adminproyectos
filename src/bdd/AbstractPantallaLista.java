package bdd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractPantallaLista extends JPanel {

    protected PanelManager panelManager;
    protected BotoneraPanel botonesPanel;
    

    public AbstractPantallaLista(PanelManager panelManager) {
        this.panelManager = panelManager;
        this.setBotoneraPanel();
        armarPantallaPanel();
    }

    public void armarPantallaPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(botonesPanel);
        
        this.botonesPanel.getOkBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarAccionOk();
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
    }


    public abstract void ejecutarAccionOk();
    public abstract void ejecutarAccionCancel();
}


