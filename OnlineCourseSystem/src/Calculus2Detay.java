import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class Calculus2Detay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Calculus2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculus2Detay frame = new Calculus2Detay();
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
	public Calculus2Detay() {
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
		btnNewButton.setBounds(163, 224, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Calculus 2");
		lblNewLabel.setBounds(183, 22, 92, 29);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnCalculusIs = new JEditorPane();
		dtrpnCalculusIs.setText("Calculus 2 is an advanced mathematical course that focuses on topics such as integration techniques, applications of integration, infinite sequences and series, parametric equations, and polar coordinates, providing a deeper understanding of the fundamental concepts and applications of calculus.");
		dtrpnCalculusIs.setBounds(71, 76, 327, 102);
		contentPane.add(dtrpnCalculusIs);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KursEkranıMath nt = new KursEkranıMath();
				nt.NewScreen_Math();
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 6, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
