package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import javax.swing.UIManager;

import funciones.Funciones;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Insets;
import java.awt.Component;


public class Historia extends JFrame
{

	private int momento = 0;
	private JTextPane txtpnbienvenidos;
	private String nombre = "";
	private String nombreRival = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historia frame = new Historia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Historia() {
		setForeground(new Color(0, 51, 51));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Historia.class.getResource("/imagenes/Pokéball.png")));
		getContentPane().setBackground(new Color(0, 51, 51));
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		setResizable(false);
		setTitle("Pokemon Elite Battle [1.0]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 319);
		getContentPane().setLayout(new MigLayout("", "[10,fill][grow][][10,fill]", "[10,fill][38.00][156.00,fill][9.00][][10,fill]"));
		
		JLabel lblNewLabel = new JLabel("Pokemon Elite Battle");
		lblNewLabel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setSize(new Dimension(100, 0));
		lblNewLabel.setOpaque(true);
		getContentPane().add(lblNewLabel, "cell 1 1 2 1,growx");
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 1 2 2 1,grow");
		
		txtpnbienvenidos = new JTextPane();
		txtpnbienvenidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnbienvenidos.setForeground(new Color(0, 51, 51));
		txtpnbienvenidos.setText("¡Bienvenido al mundo Pokémon!");
		txtpnbienvenidos.setBorder(UIManager.getBorder("DesktopIcon.border"));
		txtpnbienvenidos.setBackground(new Color(204, 255, 204));
		txtpnbienvenidos.setSelectedTextColor(new Color(245, 255, 250));
		txtpnbienvenidos.setEditable(false);
		scrollPane.setViewportView(txtpnbienvenidos);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 51, 0));
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e)
			{
				momento++;
				if (momento == 6)
					pedirNombre();
				mostrarBienvenida(momento);
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setSize(new Dimension(25, 25));
		btnNewButton.setMinimumSize(new Dimension(25, 25));
		btnNewButton.setMaximumSize(new Dimension(25, 25));
		btnNewButton.setIcon(new ImageIcon(Historia.class.getResource("/imagenes/der.png")));
		getContentPane().add(btnNewButton, "cell 2 4");

		ImageIcon fondo = new ImageIcon("imagenes/fondo1_pokeball_cristal.jpg");
	}

	protected void mostrarBienvenida(int momento)
	{
		String texto = "\n\n";
		switch (momento)
		{
			case 1:
				texto += "¡Me llamo OAK! ¡Pero la gente me llama el profesor Pokémon!";
				break;
			case 2:
				texto += "¡Este mundo está habitado por unas criaturas llamadas Pokémon!";
				break;
			case 3:
				texto += "Para algunos, los Pokémon son mascotas, pero otros los usan para pelear.";
				break;
			case 4:
				texto += "En cuanto a mí, estudio a los Pokémon como profesión.";
				break;
			case 5:
				texto += "Pero antes que nada, dime, ¿cómo te llamas y a qué región perteneces?";
				break;
			case 6:
				texto += "Ya veo, así que te llamas " + this.nombre + " y eres de /////////////.";
				break;
			case 7:
				texto += "Este es mi nieto " + this.nombreRival + ". Él ha sido tu rival desde que eras un niño.";
				break;
			case 8:
				texto += "¡" + this.nombre + "! ¡Tu propia leyenda Pokémon está a punto de comenzar!";
				break;
			case 9:
				texto += "¡Te espera un mundo de sueños y aventuras con los Pokémon! ¡adelante!";
				break;
				
		}
		this.txtpnbienvenidos.setText(this.txtpnbienvenidos.getText() + texto);
	}

	protected void pedirNombre()
	{
		this.nombre = JOptionPane.showInputDialog("Nombre:");
	}


	
}
