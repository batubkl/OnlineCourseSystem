import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class Calculus1Detay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Calculus1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculus1Detay frame = new Calculus1Detay();
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
	public Calculus1Detay() {
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
		btnNewButton.setBounds(165, 224, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Calculus 1");
		lblNewLabel.setBounds(178, 22, 104, 29);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnCalculusIs = new JEditorPane();
		dtrpnCalculusIs.setText("Calculus 1 is a fundamental course in mathematics that introduces students to the concepts of limits, derivatives, and integrals, providing them with the tools to analyze and model the rate of change of functions and calculate areas under curves.");
		dtrpnCalculusIs.setBounds(44, 83, 361, 87);
		contentPane.add(dtrpnCalculusIs);
		
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
