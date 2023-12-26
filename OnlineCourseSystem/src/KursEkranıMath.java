import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JProgressBar;

public class KursEkranıMath extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen_Math() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KursEkranıMath frame = new KursEkranıMath();
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
	public KursEkranıMath() {
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Math Courses");
		lblNewLabel.setBounds(161, 19, 169, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Discrete Mathematics");
		lblNewLabel_1.setBounds(21, 57, 116, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Calculus 1");
		lblNewLabel_2.setBounds(21, 96, 83, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Calculus 2 ");
		lblNewLabel_3.setBounds(21, 136, 83, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Analysis");
		lblNewLabel_4.setBounds(21, 178, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Lineer Algebra");
		lblNewLabel_5.setBounds(21, 219, 96, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("10$");
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DiscreteDetay nw = new DiscreteDetay();
                nw.NewScreen_Discrete();
                dispose();
            }
        });
		btnNewButton.setBounds(327, 52, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("18$");
		btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calculus1Detay nw = new Calculus1Detay();
                nw.NewScreen_Calculus1();
                dispose();
            }
        });
		btnNewButton_1.setBounds(327, 91, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("30$");
		btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calculus2Detay nw = new Calculus2Detay();
                nw.NewScreen_Calculus2();
                dispose();
            }
        });
		btnNewButton_2.setBounds(327, 131, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("12$");
		btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AnalysisDetay nw = new AnalysisDetay();
                nw.NewScreen_Analysis();
                dispose();
            }
        });
		btnNewButton_3.setBounds(327, 173, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("25$");
		btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LineerAlgebraDetay nw = new LineerAlgebraDetay();
                nw.NewScreen_LineerAlgebra();
                dispose();
            }
        });
		btnNewButton_4.setBounds(327, 214, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(35);
		progressBar.setBounds(149, 53, 146, 20);
		contentPane.add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(55);
		progressBar_1.setBounds(149, 92, 146, 20);
		contentPane.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(85);
		progressBar_2.setBounds(149, 136, 146, 20);
		contentPane.add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(20);
		progressBar_3.setBounds(149, 178, 146, 20);
		contentPane.add(progressBar_3);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setValue(65);
		progressBar_4.setBounds(149, 219, 146, 20);
		contentPane.add(progressBar_4);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.setBounds(0, 6, 83, 20);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_5.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                Kategori nw = new Kategori();
	                nw.NewScreen_Kategori();
	                dispose();
	            }
	        });
		
		
		
	}
}
