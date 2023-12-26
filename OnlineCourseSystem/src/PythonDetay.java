import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class PythonDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Python() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PythonDetay frame = new PythonDetay();
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
	public PythonDetay() {
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
		btnNewButton.setBounds(165, 218, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Python");
		lblNewLabel.setBounds(194, 20, 68, 23);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnPythonIsA = new JEditorPane();
		dtrpnPythonIsA.setText("Python is a versatile and beginner-friendly programming language known for its simplicity and readability, widely used in various domains such as web development, data analysis, artificial intelligence, and automation, making it an ideal choice for both novice and experienced programmers");
		dtrpnPythonIsA.setBounds(51, 75, 365, 96);
		contentPane.add(dtrpnPythonIsA);
		
		JButton btnNewButton_1 = new JButton("Back");

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KursEkranı_Soft nt = new KursEkranı_Soft();
				nt.NewScreen_Software();
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 6, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
