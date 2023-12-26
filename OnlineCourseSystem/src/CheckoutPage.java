import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;


public class CheckoutPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtNamesurname;
	private JTextField txtCardNumber;
	private JTextField txtExpDate;
	private JTextField txtCcv;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	
	/**
	 * Launch the application.
	 */
	public static void NewScreen_Check() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckoutPage frame = new CheckoutPage();
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
	public CheckoutPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNamesurname = new JTextField();
		txtNamesurname.setToolTipText("");
		txtNamesurname.setBounds(147, 84, 130, 26);
		contentPane.add(txtNamesurname);
		txtNamesurname.setColumns(10);
		txtNamesurname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(txtNamesurname.getText().matches("[A-Z]{1}+[a-z]{2,}"))  {
                	
                    lblNewLabel_1.setText("Valid Name."); }
                else 
                    lblNewLabel_1.setText("Invalid Name.");
                	
            }
        });
		
		txtCardNumber = new JTextField();
		txtCardNumber.setBounds(147, 122, 130, 26);
		contentPane.add(txtCardNumber);
		txtCardNumber.setColumns(10);
		txtCardNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(txtCardNumber.getText().matches("[0-9]{16}")) {
                
                    lblNewLabel_1.setText("Valid Card Number."); }
                else
                    lblNewLabel_1.setText("Invalid Card Number.");
                	
            }
        });
		
		txtExpDate = new JTextField();
		txtExpDate.setToolTipText("");
		txtExpDate.setBounds(147, 164, 130, 26);
		contentPane.add(txtExpDate);
		txtExpDate.setColumns(10);
		txtExpDate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(txtExpDate.getText().matches("(0[1-9]|1[012])/2[0-9]")) {
                	
                    lblNewLabel_1.setText("Valid Exp Date."); }
                else
                    lblNewLabel_1.setText("Invalid Exp Date.");
                	
            }
        });
		
		txtCcv = new JTextField();
		txtCcv.setBounds(147, 202, 130, 26);
		contentPane.add(txtCcv);
		txtCcv.setColumns(10);
		txtCcv.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(txtCcv.getText().matches("[0-9]{3}")) {
                	
                    lblNewLabel_1.setText("Valid CCV."); }
                else
                    lblNewLabel_1.setText("Invalid CCV.");
                	
            }
        });
		
		JButton btnNewButton = new JButton("Pay Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if (e.getSource() == btnNewButton) {
				if (txtNamesurname.getText().isEmpty() || txtCardNumber.getText().toString().isEmpty() || txtExpDate.getText().isEmpty() || txtCcv.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please fill all fields.");
		            return;
		        }
				else {
					if(!Pattern.matches("[A-Z]{1}+[a-z]{2,}", txtNamesurname.getText()) ) {
					JOptionPane.showMessageDialog(null,"Name is invalid. Please check again!");
					return;
				}
					else if( !Pattern.matches("[0-9]{16}", txtCardNumber.getText())) {
						JOptionPane.showMessageDialog(null,"Card number is invalid. Check again!");
						return;
					}
					else if( !Pattern.matches("(0[1-9]|1[012])/2[0-9]", txtExpDate.getText())) {
						JOptionPane.showMessageDialog(null,"Exp. date is invalid. Check again!");
						return;
					}
					else if( !Pattern.matches("[0-9]{3}", txtCcv.getText())) {
						JOptionPane.showMessageDialog(null,"CCV number is invalid. Check again!");
						return;
					}
					else  {
						JOptionPane.showMessageDialog(null,"Payment Successfull");
						Kategori nw = new Kategori();
		                nw.NewScreen_Kategori();
		                dispose();
						}
				}
				
			}
			});
		
		btnNewButton.setBounds(314, 153, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Payment Details");
		lblNewLabel.setBounds(21, 22, 191, 16);
		contentPane.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("Cancel");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kategori nt = new Kategori();
				nt.NewScreen_Kategori();
				dispose();
			}
		});
		btnNewButton_1.setBounds(314, 122, 117, 29);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(300, 22, 200, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setBounds(16, 89, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Card Number:");
		lblNewLabel_3.setBounds(16, 127, 119, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Exp. Date (MM/YY):");
		lblNewLabel_4.setBounds(16, 169, 130, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CCV:");
		lblNewLabel_5.setBounds(16, 207, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		
		
	}
}

