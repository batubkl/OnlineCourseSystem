import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class GeochemistryDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Geochemistry() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeochemistryDetay frame = new GeochemistryDetay();
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
	public GeochemistryDetay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Checkout");
		btnNewButton.setBounds(159, 221, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Geochemistry ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutPage nt = new CheckoutPage();
				nt.NewScreen_Check();
				dispose();
			}
			});
		lblNewLabel.setBounds(172, 20, 142, 29);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnGeochemistryIsA = new JEditorPane();
		dtrpnGeochemistryIsA.setText("Geochemistry is a scientific field that investigates the distribution, composition, and transformation of chemical elements and compounds in the Earth's systems, including rocks, minerals, soils, water, and the atmosphere, with a focus on understanding the processes that shape the Earth's geology and the interactions between Earth materials and living organisms.");
		dtrpnGeochemistryIsA.setBounds(59, 61, 345, 128);
		contentPane.add(dtrpnGeochemistryIsA);
		
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
