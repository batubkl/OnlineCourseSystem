import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class DiscreteDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Discrete() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiscreteDetay frame = new DiscreteDetay();
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
	public DiscreteDetay() {
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
		btnNewButton.setBounds(165, 223, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Discrete Mathematics");
		lblNewLabel.setBounds(146, 22, 136, 29);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnDiscreteMathematicsIs = new JEditorPane();
		dtrpnDiscreteMathematicsIs.setText("Discrete mathematics is a branch of mathematics that focuses on studying mathematical structures and objects that are countable or distinct, such as integers, graphs, and sets.");
		dtrpnDiscreteMathematicsIs.setBounds(66, 95, 317, 70);
		contentPane.add(dtrpnDiscreteMathematicsIs);
		
		JButton btnNewButton_1 = new JButton("Back");

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KursEkranıMath nt = new KursEkranıMath();
				nt.NewScreen_Math();
				dispose();
			}
		});
		btnNewButton_1.setBounds(6, 6, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
