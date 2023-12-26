import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

public class CPlusDetay2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_CPlus() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CPlusDetay2 frame = new CPlusDetay2();
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
	public CPlusDetay2() {
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
		btnNewButton.setBounds(157, 208, 117, 29);
		contentPane.add(btnNewButton);
		
		JEditorPane dtrpnCIsA = new JEditorPane();
		dtrpnCIsA.setText("C++ is a powerful programming language used for developing a wide range of applications and software");
		dtrpnCIsA.setBounds(77, 90, 305, 48);
		contentPane.add(dtrpnCIsA);
		
		JLabel lblNewLabel = new JLabel("C++");
		lblNewLabel.setBounds(194, 28, 80, 29);
		contentPane.add(lblNewLabel);
		
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
