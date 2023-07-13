package gui;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class JPanelBackground extends JPanel {

	private Image imagen;
	/**
	 * Create the panel.
	 */
	public JPanelBackground() {
		//this.imagen = new Image("imagenes/fondo1_pokeball_cristal.jpg");
	}
	
	
	public JPanelBackground(Image imagen) {
		super();
		this.imagen = imagen;
	}


	public Image getImagen() {
		return imagen;
	}


	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imagen, 0,0, null);
	}
	
	
	

}
