import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Kullanici {
	    private String txtName;
	    private String txtSurname;
	    private String txtUserName;
	    private String txtPassword;
	    private String txtEmail;
	    private String txtPhone;
	    private String txtPostalCode;
	    private String txtBirthDate;
	    private String cmbGender;
	    
	    
	    public Kullanici(String name, String surname, String username, String password, String email, String phone, String postalcode, 
	    		String birthdate, String gender) {
	        this.txtName = name;
	        this.txtSurname = surname;
	        this.txtUserName = username;
	        this.txtPassword = password;
	        this.txtEmail = email;
	        this.txtPhone = phone;
	        this.txtPostalCode = postalcode;
	        this.txtBirthDate = birthdate;
	        this.cmbGender = gender;
	        
	    }

	    public Object getPassword() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getUsername() {
			// TODO Auto-generated method stub
			return txtUserName;
		}

		public Kullanici(JTextField txtName2, JTextField txtSurname2, JPasswordField txtPass, JTextField txtBirthDate2,
				JTextField txtPhone2, JTextField txtPostalCode2, JTextField txtEmail2, JTextField txtUserName2) {
			// TODO Auto-generated constructor stub
		}

		public String getTxtName() {
			return txtName;
		}

		public void setTxtName(String txtName) {
			this.txtName = txtName;
		}

		public String getTxtSurname() {
			return txtSurname;
		}

		public void setTxtSurname(String txtSurname) {
			this.txtSurname = txtSurname;
		}

		public String getTxtUserName() {
			return txtUserName;
		}

		@Override
		public String toString() {
			return "Kullanici [txtName=" + txtName + ", txtSurname=" + txtSurname + ", txtUserName=" + txtUserName
					+ ", txtPassword=" + txtPassword + ", txtEmail=" + txtEmail + ", txtPhone=" + txtPhone
					+ ", txtPostalCode=" + txtPostalCode + ", txtBirthDate=" + txtBirthDate + ", cmbGender=" + cmbGender
					+ "]";
		}

		public void setTxtUserName(String txtUserName) {
			this.txtUserName = txtUserName;
		}

		public String getTxtPassword() {
			return txtPassword;
		}

		public void setTxtPassword(String txtPassword) {
			this.txtPassword = txtPassword;
		}

		public String getTxtEmail() {
			return txtEmail;
		}

		public void setTxtEmail(String txtEmail) {
			this.txtEmail = txtEmail;
		}

		public String getTxtPhone() {
		
			return txtPhone;
		}

		public void setTxtPhone(String txtPhone) {
			this.txtPhone = txtPhone;
		}

		public String getTxtPostalCode() {
			return txtPostalCode;
		}

		public void setTxtPostalCode(String txtPostalCode) {
			this.txtPostalCode = txtPostalCode;
		}

		public String getTxtBirthDate() {
			
			return txtBirthDate;
		}

		public void setTxtBirthDate(String txtBirthDate) {
			
			this.txtBirthDate = txtBirthDate;
		}

		public String getCmbGender() {
			return cmbGender;
		}

		public void setCmbGender(String cmbGender) {
			this.cmbGender = cmbGender;
		}

		public Kullanici(String txtName2, String txtSurname2, JPasswordField txtPass, String txtBirthDate2,
				String txtPhone2, String txtPostalCode2, String txtEmail2, String txtUserName2) {
			// TODO Auto-generated constructor stub
		}

		

		
	}
	