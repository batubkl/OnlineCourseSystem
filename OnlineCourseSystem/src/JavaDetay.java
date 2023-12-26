import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class JavaDetay extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void NewScreen_Java() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaDetay frame = new JavaDetay();
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
	public JavaDetay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JAVA 101");
		lblNewLabel.setBounds(324, 27, 99, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Java 101 is a beginner-level course that introduces students to the \nfundamentals of the Java programming language.");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(24, 75, 754, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Instructor:");
		lblNewLabel_2.setBounds(24, 125, 184, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Checkout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckoutPage nt = new CheckoutPage();
				nt.NewScreen_Check();
				dispose();
			}
		});
		
		btnNewButton.setBounds(293, 216, 117, 29);
		contentPane.add(btnNewButton);
		
		JRadioButton chckbxNewCheckBox = new JRadioButton("Marrie B.");
		chckbxNewCheckBox.setBounds(24, 153, 128, 23);
		//contentPane.add(chckbxNewCheckBox);
		
		JRadioButton chckbxNewCheckBox_1 = new JRadioButton("John S.");
		chckbxNewCheckBox_1.setBounds(24, 180, 128, 23);
		//contentPane.add(chckbxNewCheckBox_1);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(chckbxNewCheckBox);
		bg.add(chckbxNewCheckBox_1);
		
		contentPane.add(chckbxNewCheckBox);
		contentPane.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton_1 = new JButton("Back");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KursEkranı_Soft nt = new KursEkranı_Soft();
				nt.NewScreen_Software();
				dispose();
			}
		});
		
		
		btnNewButton_1.setBounds(6, 6, 99, 23);
		contentPane.add(btnNewButton_1);
	}
}
