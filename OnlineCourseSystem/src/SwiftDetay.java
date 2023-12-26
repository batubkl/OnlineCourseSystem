
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class SwiftDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Swift() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwiftDetay frame = new SwiftDetay();
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
	public SwiftDetay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Swift");
		lblNewLabel.setBounds(272, 26, 31, 16);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnSwiftIsA = new JEditorPane();
		dtrpnSwiftIsA.setText("Swift is a powerful and intuitive programming language developed by Apple for developing software for macOS, iOS, watchOS, and tvOS devices.");
		dtrpnSwiftIsA.setBounds(129, 79, 355, 53);
		contentPane.add(dtrpnSwiftIsA);
		
		JButton btnNewButton = new JButton("CheckOut");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			CheckoutPage nt = new CheckoutPage();
			nt.NewScreen_Check();
			dispose();
		}
		});
		
		btnNewButton.setBounds(229, 206, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KursEkranı_Soft nt = new KursEkranı_Soft();
				nt.NewScreen_Software();
				dispose();
			}
		});
		btnNewButton_1.setBounds(6, 6, 117, 29);
		contentPane.add(btnNewButton_1);
	}
}
