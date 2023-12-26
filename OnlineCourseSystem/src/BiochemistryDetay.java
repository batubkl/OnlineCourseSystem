import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;

public class BiochemistryDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Biochemistry() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BiochemistryDetay frame = new BiochemistryDetay();
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
	public BiochemistryDetay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Biochemistry ");
		lblNewLabel.setBounds(175, 18, 92, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutPage nt = new CheckoutPage();
				nt.NewScreen_Check();
				dispose();
			}
			});
		btnNewButton.setBounds(165, 223, 117, 29);
		contentPane.add(btnNewButton);
		
		JEditorPane dtrpnBiochemistryIsThe = new JEditorPane();
		dtrpnBiochemistryIsThe.setText("Biochemistry is the branch of science that combines principles of biology and chemistry to study the chemical processes and molecules that occur within living organisms, including the structure and function of biological macromolecules such as proteins, nucleic acids, carbohydrates, and lipids.");
		dtrpnBiochemistryIsThe.setBounds(40, 88, 378, 96);
		contentPane.add(dtrpnBiochemistryIsThe);
		
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
