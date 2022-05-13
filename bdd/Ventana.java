package bdd;
import javax.swing.*;
import java.awt.*;


public class Ventana {
	
	public static void Pruebita(String texto1, String texto2) {
		
	

		JFrame frame = new JFrame(texto1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel(texto2);
		JButton button = new JButton("click aqui");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);


		frame.pack();
		frame.setVisible(true);
		}
		

}
