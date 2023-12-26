import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JEditorPane;

public class AnalysisDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Analysis() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnalysisDetay frame = new AnalysisDetay();
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
	public AnalysisDetay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Analysis");
		lblNewLabel.setBounds(183, 21, 81, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutPage nt = new CheckoutPage();
				nt.NewScreen_Check();
				dispose();
			}
			});
		btnNewButton.setBounds(156, 223, 117, 29);
		contentPane.add(btnNewButton);
		
		JEditorPane dtrpnAnalysisIsA = new JEditorPane();
		dtrpnAnalysisIsA.setText("Analysis is a branch of mathematics that deals with the study of limits, continuity, derivatives, integrals, and sequences, providing tools and techniques for understanding and solving complex mathematical problems.");
		dtrpnAnalysisIsA.setBounds(79, 86, 302, 86);
		contentPane.add(dtrpnAnalysisIsA);
		
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
