import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class LineerAlgebraDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_LineerAlgebra() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LineerAlgebraDetay frame = new LineerAlgebraDetay();
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
	public LineerAlgebraDetay() {
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
		btnNewButton.setBounds(169, 218, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Lineer Algebra");
		lblNewLabel.setBounds(179, 19, 99, 29);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnLinearAlgebraIs = new JEditorPane();
		dtrpnLinearAlgebraIs.setText("Linear algebra is a branch of mathematics that deals with the study of vector spaces, linear transformations, and systems of linear equations, providing essential tools and techniques for solving problems related to geometric transformations, optimization, data analysis, and mathematical modeling.");
		dtrpnLinearAlgebraIs.setBounds(25, 76, 395, 89);
		contentPane.add(dtrpnLinearAlgebraIs);
		
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
