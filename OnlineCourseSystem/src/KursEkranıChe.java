import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KursEkranıChe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Che() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KursEkranıChe frame = new KursEkranıChe();
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
	public KursEkranıChe() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chemistry Courses");
		lblNewLabel.setBounds(163, 6, 143, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Biochemistry");
		lblNewLabel_1.setBounds(24, 57, 111, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Geochemistry");
		lblNewLabel_2.setBounds(24, 96, 86, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chemical Engineering");
		lblNewLabel_3.setBounds(24, 138, 111, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Material Science");
		lblNewLabel_4.setBounds(24, 182, 121, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("20$");
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BiochemistryDetay nw = new BiochemistryDetay();
                nw.NewScreen_Biochemistry();
                dispose();
            }
        });
		btnNewButton.setBounds(327, 52, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("20$");
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GeochemistryDetay nw = new GeochemistryDetay();
                nw.NewScreen_Geochemistry();
                dispose();
            }
        });
		btnNewButton_1.setBounds(327, 91, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("15$");
		btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChemicalEngineeringDetay nw = new ChemicalEngineeringDetay();
                nw.NewScreen_ChemicalEngineering();
                dispose();
            }
        });
		btnNewButton_2.setBounds(327, 133, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("28$");
		btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MaterialScienceDetay nw = new MaterialScienceDetay();
                nw.NewScreen_MaterialScience();
                dispose();
            }
        });
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(327, 177, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(55);
		progressBar.setBounds(147, 57, 146, 20);
		contentPane.add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(75);
		progressBar_1.setBounds(147, 96, 146, 20);
		contentPane.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(30);
		progressBar_2.setBounds(147, 138, 146, 20);
		contentPane.add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(67);
		progressBar_3.setBounds(147, 182, 146, 20);
		contentPane.add(progressBar_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.setBounds(-7, 1, 99, 29);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Kategori nw = new Kategori();
                nw.NewScreen_Kategori();
                dispose();
            }
        });
		
	}
}
