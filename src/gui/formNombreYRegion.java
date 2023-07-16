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
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import javax.swing.UIManager;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;


public class formNombreYRegion extends JFrame
{
	private static final long serialVersionUID = 6867600849030478568L;
	
	private JTextField textField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formNombreYRegion frame = new formNombreYRegion();
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
	public formNombreYRegion() {
		setForeground(new Color(0, 51, 51));
		setIconImage(Toolkit.getDefaultToolkit().getImage(formNombreYRegion.class.getResource("/imagenes/Pokéball.png")));
		getContentPane().setBackground(new Color(0, 51, 51));
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		setResizable(false);
		setTitle("Pokemon Elite Battle [1.0]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 319);
		getContentPane().setLayout(new MigLayout("", "[10px,fill][90px][80px][grow][90px][][10,fill]", "[10,fill][38.00][grow][][grow][][grow][][10,fill]"));
		
		JLabel lblNewLabel = new JLabel("Pokemon Elite Battle");
		lblNewLabel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setSize(new Dimension(100, 0));
		lblNewLabel.setOpaque(true);
		getContentPane().add(lblNewLabel, "cell 1 1 5 1,growx");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		getContentPane().add(lblNewLabel_1, "cell 2 3,alignx left");
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setForeground(new Color(0, 102, 102));
		getContentPane().add(textField, "cell 3 3,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Región:");
		lblNewLabel_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		getContentPane().add(lblNewLabel_2, "cell 2 5,alignx left");
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setName("");
		comboBox.setMaximumRowCount(9);
		comboBox.setForeground(new Color(0, 102, 102));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Kanto", "Johto", "Hoenn", "Sinnoh", "Teselia", "Kalos", "Alola", "Galar", "Paldea"}));
		getContentPane().add(comboBox, "cell 3 5,growx");
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(0, 51, 0));
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setSize(new Dimension(25, 25));
		btnNewButton.setMinimumSize(new Dimension(25, 25));
		btnNewButton.setMaximumSize(new Dimension(25, 25));
		btnNewButton.setIcon(new ImageIcon(formNombreYRegion.class.getResource("/imagenes/tickVerde.png")));
		getContentPane().add(btnNewButton, "cell 5 7");

		ImageIcon fondo = new ImageIcon("imagenes/fondo1_pokeball_cristal.jpg");
	}
}
