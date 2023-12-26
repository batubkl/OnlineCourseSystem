import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class ChemicalEngineeringDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_ChemicalEngineering() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChemicalEngineeringDetay frame = new ChemicalEngineeringDetay();
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
	public ChemicalEngineeringDetay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutPage nt = new CheckoutPage();
				nt.NewScreen_Check();
				dispose();
			}
			});
		btnNewButton.setBounds(164, 224, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Chemical Engineering");
		lblNewLabel.setBounds(156, 19, 136, 35);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnChemicalEngineeringIs = new JEditorPane();
		dtrpnChemicalEngineeringIs.setText("Chemical engineering is a discipline that combines principles of chemistry, physics, biology, and engineering to design, develop, and optimize processes and systems used in the production of chemicals, pharmaceuticals, fuels, and various materials while considering safety, efficiency, and environmental sustainability.");
		dtrpnChemicalEngineeringIs.setBounds(67, 66, 326, 112);
		contentPane.add(dtrpnChemicalEngineeringIs);
		
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
