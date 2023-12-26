import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Choice;
import java.awt.SystemColor;
import java.awt.Scrollbar;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import java.awt.Color;

public class KursEkranı_Soft extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Software() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KursEkranı_Soft frame = new KursEkranı_Soft();
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
	public KursEkranı_Soft() {
		setTitle("Course System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 345, 335);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setToolTipText("Karar");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("JAVA");
		lblNewLabel_1.setBounds(21, 68, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("50$");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaDetay nt = new JavaDetay();
				nt.NewScreen_Java();
				dispose();
			}
		});
		btnNewButton.setBounds(207, 63, 117, 29);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Swift");
		
		lblNewLabel_2.setBounds(21, 113, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("28$");
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwiftDetay nw = new SwiftDetay();
                nw.NewScreen_Swift();
                dispose();
            }
        });
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(207, 100, 117, 29);
		contentPane.add(btnNewButton_1);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setPageIncrement(1);
		scrollbar.setBounds(330, 8, 15, 386);
		contentPane.add(scrollbar);
		
		JLabel lblNewLabel_3 = new JLabel("C++");
		lblNewLabel_3.setBounds(21, 153, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("C#");
		lblNewLabel_4.setBounds(21, 195, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Python");
		lblNewLabel_5.setBounds(21, 240, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(51, 255, 0));
		progressBar.setBackground(SystemColor.controlShadow);
		progressBar.setValue(30);
		progressBar.setBounds(122, 64, 73, 20);
		contentPane.add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setForeground(UIManager.getColor("GREEN"));
		progressBar_1.setValue(45);
		progressBar_1.setBounds(122, 101, 73, 20);
		contentPane.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(85);
		progressBar_2.setBounds(122, 141, 73, 20);
		contentPane.add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(15);
		progressBar_3.setBounds(122, 191, 73, 20);
		contentPane.add(progressBar_3);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setValue(50);
		progressBar_4.setBounds(122, 240, 73, 20);
		contentPane.add(progressBar_4);
		
		JButton btnNewButton_2 = new JButton("45$");
		btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CPlusDetay2 nw = new CPlusDetay2();
                nw.NewScreen_CPlus();
                dispose();
            }
        });
		btnNewButton_2.setBounds(207, 140, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("40$");
		btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CSharpDetay nw = new CSharpDetay();
                nw.NewScreen_CSharp();
                dispose();
            }
        });
		btnNewButton_3.setBounds(207, 190, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("35$");
		btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PythonDetay nw = new PythonDetay();
                nw.NewScreen_Python();
                dispose();
            }
        });
		btnNewButton_4.setBounds(207, 235, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_9 = new JLabel("Software Courses");
		lblNewLabel_9.setForeground(UIManager.getColor("PasswordField.selectionForeground"));
		lblNewLabel_9.setBounds(122, 17, 129, 16);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.setBounds(0, 0, 99, 29);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Kategori nw = new Kategori();
                nw.NewScreen_Kategori();
                dispose();
            }
        });
		
	}

	public void open() {
		// TODO Auto-generated method stub
		
	}
}
