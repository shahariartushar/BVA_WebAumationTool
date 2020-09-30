import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;

public class Home {

	public JFrame frmHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.getContentPane().setBackground(new Color(192, 192, 192));
		frmHome.setTitle("HOME");
		frmHome.setBounds(100, 100, 488, 130);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECT A SITE:");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 10));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(27, 13, 100, 16);
		frmHome.getContentPane().add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		
		//todo: add more sites name
		comboBox.addItem("Google");
		comboBox.addItem("yahoo!");
		comboBox.addItem("facebook");
		comboBox.addItem("LinkedIn");
		comboBox.addItem("Coursera");
		comboBox.addItem("CNN");
		
		
		
		comboBox.setBounds(27, 42, 304, 22);
		frmHome.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(0, 153, 0));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//todo: select correct site for SetBV
				frmHome.dispose();
				SetBV_google google = new SetBV_google();
				google.frmSetBV_google.setVisible(true);
			}
		});
		btnNewButton.setBounds(345, 41, 97, 25);
		frmHome.getContentPane().add(btnNewButton);
	}
}
