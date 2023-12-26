import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class LoginPage extends JFrame implements ItemListener, ActionListener {
	//protected static final Kullanici[] KullaniciListesi= null;
	JRadioButton rbLogin = new JRadioButton("Login");
	JRadioButton rbSignUp = new JRadioButton("Sign Up");

	JTextField txtUserName = new JTextField();
	JPasswordField txtPass = new JPasswordField();
	JTextField txtName = new JTextField();
	JTextField txtSurname = new JTextField();
	JTextField txtBirthDate = new JTextField();
	JTextField txtPhone = new JTextField();
	JTextField txtPostalCode = new JTextField();
	JTextField txtEmail = new JTextField();
	//JComboBox  cmbGender1 = new JComboBox();
	private LinkedList<String[]> Kullanici;
	JButton btnLogin = new JButton("Login");
	
	JButton btnSignUp = new JButton("Sign Up");
	
	//Kullanici list = new Kullanici(txtName, txtSurname, txtPass, txtBirthDate, txtPhone, txtPostalCode, txtEmail,txtUserName);
	
	//LinkedList<Kullanici> kullaniciListesi = new LinkedList<Kullanici>();
	//Kullanici.addStudent(new Student("ahmet")); 
	//LinkedList<Kullanici> kullaniciListesi = new LinkedList<>();

	
	// Yeni bir Kullanici nesnesi oluştur
	
	
	
	DefaultComboBoxModel<String> dlmGender;
	JComboBox<String> cmbGender;
	JLabel lblInfo;

	public LoginPage() {
		super("Login / Sign Up Page");
		setSize(350, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setDesign();
	}

	public void setDesign() {
		setLayout(new GridLayout(11, 2));
		Kullanici = new LinkedList<String[]>();
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbLogin);
		bg.add(rbSignUp);
		
		JPanel pnlRadio = new JPanel(new FlowLayout());
		pnlRadio.add(rbLogin);
		pnlRadio.add(rbSignUp);
		rbLogin.addItemListener(this);
		rbSignUp.addItemListener(this);
		
		JPanel pnlButtons = new JPanel();
		pnlButtons.setLayout(new BoxLayout(pnlButtons, BoxLayout.X_AXIS));
		
		pnlButtons.add(btnSignUp);
		pnlButtons.add(btnLogin);
		
		
		//btnLogin.addActionListener(new ActionListener() {
		

		lblInfo = new JLabel("");
		add(lblInfo);
		add(pnlRadio);

		add(new JLabel("User Name"));
		add(txtUserName);
		txtUserName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtUserName.getText().matches("[a-zA-Z0-9]{3,}")) 
					lblInfo.setText("Valid User Name.");
				else
					lblInfo.setText("Invalid User Name.");
			}
		});

		add(new JLabel("Password"));
		txtPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String password = new String(txtPass.getPassword());
				if(password.matches(".{6,}")) 
					lblInfo.setText("Valid Password.");
				else
					lblInfo.setText("Invalid Password.");
				
//				txtPass.setText(new String(txtPass.getPassword()).replace(" ", ""));
//				lblInfo.setText(new String(txtPass.getPassword()));
			}
		});
		
		add(txtPass);

		
		

		add(new JLabel("Name"));
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) { //? : {0, 1}
				if(txtName.getText().matches("[A-Z]{1}+[a-z]{2,}")) 
					lblInfo.setText("Valid Name.");
				else
					lblInfo.setText("Invalid Name.");
				
			}
		});
		
		txtPass.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				lblInfo.setText("");
				
			}

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		}); 

		add(txtName);

		add(new JLabel("Surname"));
		txtSurname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) { //? : {0, 1}
				if(txtSurname.getText().matches("[A-Z]{1}+[a-z]{2,}")) 
					lblInfo.setText("Valid Surname.");
				else
					lblInfo.setText("Invalid surname.");
				
			}
		});
		add(txtSurname);
		
		

		add(new JLabel("Gender"));
		dlmGender = new DefaultComboBoxModel<String>();
		dlmGender.addElement(Gender.FEMALE.toString());
		dlmGender.addElement(Gender.MALE.toString());
		dlmGender.addElement(Gender.NOTSPECIFIED.toString());
		cmbGender = new JComboBox<String>(dlmGender);
		add(cmbGender);

		
		
		add(new JLabel("Birth Date (DD.MM.YYYY)"));
		txtBirthDate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtBirthDate.getText().matches("[0-3]{1}[0-9]{1}[.](0[1-9]|1[012])[.]{1}[0-9]{4}"))
					lblInfo.setText("Valid Birthdate");
				else
					lblInfo.setText("Invalid Birthdate");
			}
		});
		add(txtBirthDate);
		
		add(new JLabel("Phone Number"));
		txtPhone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtPhone.getText().matches("([+]{1}[9]{1}[0]{1}[0-9]{10})" // +902123810000
						+ "|[0]{2}[9]{1}[0]{1}[0-9]{10}" // 00902123810000
						+ "|[0-9]{10}")) // 2123810000
					lblInfo.setText("Valid Phone Number");
				else
					lblInfo.setText("Invalid Phone Number");
			}
		});
		add(txtPhone);

		add(new JLabel("Postal Code"));
		
		add(txtPostalCode);
		txtPostalCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtPostalCode.getText().matches("[0-9]{5}"))
					lblInfo.setText("Valid Postal Code");
				else
					lblInfo.setText("Invalid Postal Code");
			}
		});
		add(new JLabel("Email"));
		String emailRegex = "([a-z0-9]+)" //name.surname
				+ "@"
				+ "[a-z0-9]{2,}" //gmail
				+ "\\.[a-z0-9]{3}"; //.com
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtEmail.getText().matches(emailRegex))
					lblInfo.setText("Valid Email");
				else
					lblInfo.setText("Invalid Email");
			}
		});
		add(txtEmail);

		add(new JLabel());
		add(pnlButtons);
		btnLogin.addActionListener(this);
		btnSignUp.addActionListener(this);
	}
	
	 
	 
	public void actionPerformed(ActionEvent e) {
		 
        if (e.getSource() == btnLogin) {
            String username = txtUserName.getText();
            String password = new String(txtPass.getPassword());
            
            boolean isLoggedIn = false;

            for (String[] user : Kullanici) {
                if (user[0].equals(username) && user[1].equals(password)) {
                    isLoggedIn = true;
                    break;
                }
            }
            
            
            
            if( !Pattern.matches("[a-zA-Z0-9]{3,}", txtUserName.getText())) {
				JOptionPane.showMessageDialog(null,"Username is invalid. Check again!");
				return;
			}
            else if( !Pattern.matches(".{6,}", password)) {
				JOptionPane.showMessageDialog(null,"Password is invalid. Check again!");
				return;
			}
            else  {
            	if (isLoggedIn) {
                    JOptionPane.showMessageDialog(this, "Login successful");
                    Kategori nw = new Kategori();
                    nw.NewScreen_Kategori();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Login failed");
                }

            }
            
            

        } else if (e.getSource() == btnSignUp) {
            String newUsername = txtUserName.getText();
            String newPassword = new String(txtPass.getPassword());
     
            if (txtUserName.getText().isEmpty() || txtPass.getPassword().toString().isEmpty() || txtEmail.getText().isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Please fill all fields.");
	            return;
	        }
            else if(!Pattern.matches("[A-Z]{1}+[a-z]{2,}", txtName.getText()) ) {
				JOptionPane.showMessageDialog(null,"Name is invalid. Please check again!");
				return;
			}
			else if( !Pattern.matches("[A-Z]{1}+[a-z]{2,}", txtSurname.getText())) {
					JOptionPane.showMessageDialog(null,"Surname is invalid. Check again!");
					return;
				}
			else if( !Pattern.matches("[a-zA-Z0-9]{3,}", txtUserName.getText())) {
					JOptionPane.showMessageDialog(null,"Username is invalid. Check again!");
					return;
				}
			else if( !Pattern.matches(".{6,}", newPassword)) {
				JOptionPane.showMessageDialog(null,"Password is invalid. Check again!");
				return;
			}
			else if( !Pattern.matches(("([a-z0-9]+)"+ "@"+ "[a-z0-9]{2,}"+ "\\.[a-z0-9]{3}") , txtEmail.getText())) {
					JOptionPane.showMessageDialog(null,"Email is invalid. Check again!");
					return;
				}
			else if( !Pattern.matches(("([+]{1}[9]{1}[0]{1}[0-9]{10})"+ "|[0]{2}[9]{1}[0]{1}[0-9]{10}"+ "|[0-9]{10}"), txtPhone.getText())) {
				JOptionPane.showMessageDialog(null,"Phone number is invalid. Check again!");
				return;
			}
			else if( !Pattern.matches("[0-9]{5}", txtPostalCode.getText())) {
				JOptionPane.showMessageDialog(null,"Postal code is invalid. Check again!");
				return;
			}
			else if( !Pattern.matches("[0-3]{1}[0-9]{1}[.](0[1-9]|1[012])[.]{1}[0-9]{4}", txtBirthDate.getText())) {
				JOptionPane.showMessageDialog(null,"Birthdate is invalid. Check again!");
				return;
			}
			
			else {
            Kullanici.add(new String[]{newUsername, newPassword});
            JOptionPane.showMessageDialog(this, "Signup successful");
			}
        }
	
	}
	
	public static void main(String[] args) {
		new LoginPage().setVisible(true);
		
	}
	        


          // Kullanici.add(new String[]{newUsername, newPassword});

         
       
	       
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == rbLogin) {
			txtUserName.setEditable(true);
			txtPass.setEditable(true);
			txtBirthDate.setEditable(false);
			txtEmail.setEditable(false);
			txtName.setEditable(false);
			txtPhone.setEditable(false);
			txtPostalCode.setEditable(false);
			txtSurname.setEditable(false);
			cmbGender.setEditable(false);
			btnSignUp.setVisible(false);
			btnLogin.setVisible(true);
			btnLogin.setText("Login");
			txtUserName.setText("");
			txtPass.setText("");
			txtBirthDate.setText("");
			txtEmail.setText("");
			txtName.setText("");
			txtPhone.setText("");
			txtPostalCode.setText("");
			txtSurname.setText("");
			cmbGender.setSelectedIndex(-1);
			 
	
			
		} else if(e.getSource() == rbSignUp) {
			txtUserName.setEditable(true);
			txtPass.setEditable(true);
			txtBirthDate.setEditable(true);
			txtEmail.setEditable(true);
			txtName.setEditable(true);
			txtPhone.setEditable(true);
			txtPostalCode.setEditable(true);
			txtSurname.setEditable(true);
			cmbGender.setEditable(true);
			btnSignUp.setVisible(true);
			btnLogin.setVisible(false);
			btnSignUp.setText("Sign Up");
			txtUserName.setText("");
			txtPass.setText("");
			txtBirthDate.setText("");
			txtEmail.setText("");
			txtName.setText("");
			txtPhone.setText("");
			txtPostalCode.setText("");
			txtSurname.setText("");
			cmbGender.setSelectedIndex(-1);
			  
			
			//btnLogin.setText("Sign Up");
		}
			
	
	}
	}
	
	
		
		 

	
	
	




