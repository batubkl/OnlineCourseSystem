import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class CSharpDetay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_CSharp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CSharpDetay frame = new CSharpDetay();
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
	public CSharpDetay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C#");
		lblNewLabel.setBounds(199, 21, 77, 34);
		contentPane.add(lblNewLabel);
		
		JEditorPane dtrpnCIsA = new JEditorPane();
		dtrpnCIsA.setText("C# is a modern, object-oriented programming language developed by Microsoft that is widely used for building a variety of applications, ranging from desktop software to web applications, and it is particularly popular for developing software on the .NET framework.");
		dtrpnCIsA.setBounds(55, 87, 358, 85);
		contentPane.add(dtrpnCIsA);
		
		JButton btnNewButton = new JButton("Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutPage nt = new CheckoutPage();
				nt.NewScreen_Check();
				dispose();
			}
			});
		btnNewButton.setBounds(159, 224, 117, 29);
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
