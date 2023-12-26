import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;

public class MaterialScienceDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_MaterialScience() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaterialScienceDetay frame = new MaterialScienceDetay();
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
	public MaterialScienceDetay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Material Science");
		lblNewLabel.setBounds(161, 16, 138, 45);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutPage nt = new CheckoutPage();
				nt.NewScreen_Check();
				dispose();
			}
			});
		btnNewButton.setBounds(161, 222, 117, 29);
		contentPane.add(btnNewButton);
		
		JEditorPane dtrpnMaterialScienceIs = new JEditorPane();
		dtrpnMaterialScienceIs.setText("Material science is a multidisciplinary field that focuses on the study of the properties, structure, synthesis, and performance of materials, encompassing metals, ceramics, polymers, composites, and electronic materials, with the aim of understanding and designing materials with desired properties for various applications.");
		dtrpnMaterialScienceIs.setBounds(48, 84, 372, 102);
		contentPane.add(dtrpnMaterialScienceIs);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KursEkranıChe nt = new KursEkranıChe();
				nt.NewScreen_Che();
				dispose();
			}
		});
		btnNewButton_1.setBounds(6, 6, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
