import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtS;
	private JTextField txtEmail;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(34, 76, 130, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sign up");
		lblNewLabel.setBounds(174, 19, 47, 16);
		contentPane.add(lblNewLabel);
		
		txtS = new JTextField();
		txtS.setText("Surname");
		txtS.setBounds(34, 114, 130, 26);
		contentPane.add(txtS);
		txtS.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("e-mail");
		txtEmail.setBounds(34, 151, 130, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(34, 189, 130, 26);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setBounds(261, 130, 117, 29);
		contentPane.add(btnNewButton);
	}
}
