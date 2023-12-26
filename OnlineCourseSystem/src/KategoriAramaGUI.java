import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class KategoriAramaGUI extends JFrame implements ActionListener {

    private JTree kategoriAgaci;
    private DefaultMutableTreeNode anaKategoriNode;
    private DefaultMutableTreeNode softwareNode;
    private DefaultMutableTreeNode mathNode;
    private DefaultMutableTreeNode cheNode;
    private JTextField aramaKutusu;
    private JButton araButonu;


    public static void NewScreen_Arama() {
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KategoriAramaGUI frame = new KategoriAramaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    	
    	
    }
    

    
	public KategoriAramaGUI() {
        super("Search Course");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        anaKategoriNode = new DefaultMutableTreeNode("Kategoriler");
        softwareNode = new DefaultMutableTreeNode("Software");
        anaKategoriNode.add(softwareNode);
        mathNode = new DefaultMutableTreeNode("Math");
        anaKategoriNode.add(mathNode);
        cheNode = new DefaultMutableTreeNode("Che");
        anaKategoriNode.add(cheNode);
        DefaultMutableTreeNode javaNode = new DefaultMutableTreeNode("Java");
        softwareNode.add(javaNode);
        DefaultMutableTreeNode CPlusNode = new DefaultMutableTreeNode("C++");
        softwareNode.add(CPlusNode);
        DefaultMutableTreeNode CSharpNode = new DefaultMutableTreeNode("C#");
        softwareNode.add(CSharpNode);
        DefaultMutableTreeNode PythonNode = new DefaultMutableTreeNode("Python");
        softwareNode.add(PythonNode);
        DefaultMutableTreeNode AyrıkNode = new DefaultMutableTreeNode("Ayrık Matematik");
        softwareNode.add(AyrıkNode);
        DefaultMutableTreeNode Calculus1Node = new DefaultMutableTreeNode("Calculus 1");
        softwareNode.add(Calculus1Node);
        DefaultMutableTreeNode Calculus2Node = new DefaultMutableTreeNode("Calculus 2");
        softwareNode.add(Calculus2Node);
        DefaultMutableTreeNode AnalysisNode = new DefaultMutableTreeNode("Analysis");
        softwareNode.add(AnalysisNode);
        DefaultMutableTreeNode LineerNode = new DefaultMutableTreeNode("Lineer Algebra");
        softwareNode.add(LineerNode);
        DefaultMutableTreeNode swiftNode = new DefaultMutableTreeNode("Swift");
        softwareNode.add(swiftNode);
        DefaultMutableTreeNode BioNode = new DefaultMutableTreeNode("Biochemistry");
        softwareNode.add(BioNode);
        DefaultMutableTreeNode GeoNode = new DefaultMutableTreeNode("Geochemistry");
        mathNode.add(GeoNode);
        DefaultMutableTreeNode ChemicalNode = new DefaultMutableTreeNode("Chemical Engineering");
        mathNode.add(ChemicalNode);
        DefaultMutableTreeNode MaterialChemNode = new DefaultMutableTreeNode("Material Science");
        cheNode.add(MaterialChemNode);

        kategoriAgaci = new JTree(anaKategoriNode);
        kategoriAgaci.setRootVisible(false);
        DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) kategoriAgaci.getCellRenderer();
        renderer.setLeafIcon(null);
        renderer.setOpenIcon(null);
        renderer.setClosedIcon(null);

        aramaKutusu = new JTextField(20);
        aramaKutusu.setMaximumSize(new Dimension(Integer.MAX_VALUE, aramaKutusu.getPreferredSize().height));
        aramaKutusu.addActionListener(this);

        araButonu = new JButton("Search");
        araButonu.addActionListener(this);

        JButton btnNewButton_4 = new JButton("Back");
        btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				Kategori nw = new Kategori();
                nw.NewScreen_Kategori();
                dispose();
			}
			});
		
		
        JPanel aramaPaneli = new JPanel();
        aramaPaneli.setLayout(new BoxLayout(aramaPaneli, BoxLayout.X_AXIS));
        aramaPaneli.add(aramaKutusu);
        aramaPaneli.add(araButonu);
        aramaPaneli.add(btnNewButton_4);
        add(aramaPaneli);

        JPanel anaPanel = new JPanel(new BorderLayout());
        anaPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

       
    }
	public void actionPerformed(ActionEvent e) {
	    String aranan = aramaKutusu.getText();
	    TreePath path = aramaYap(anaKategoriNode, aranan);
	    if (path != null) {
	        kategoriAgaci.setSelectionPath(path);
	        KursuGoster(path.getLastPathComponent().toString());
	    } else {
	        JOptionPane.showMessageDialog(this, "The searched course was not found.");
	    }
	}

	private TreePath aramaYap(DefaultMutableTreeNode rootNode, String aranan) {
	   // Enumeration<DefaultMutableTreeNode> nodes = rootNode.depthFirstEnumeration();
	    Enumeration<TreeNode> enumNode = ((DefaultMutableTreeNode) kategoriAgaci.getModel().getRoot()).breadthFirstEnumeration();
	    while (enumNode.hasMoreElements()) {
	        DefaultMutableTreeNode node = (DefaultMutableTreeNode) enumNode.nextElement();
	        if (node.toString().toLowerCase().equals(aranan.toLowerCase())) {
	            return new TreePath(node.getPath());
	        }
	    }
	    return null;
	}

	private void KursuGoster(String kategoriAdi) {
		//String nodeName = kategoriAdi.getUserObject().toString();
	    if (kategoriAdi.equals("Java")) {
	    	JavaDetay nw = new JavaDetay();
            nw.NewScreen_Java();
            dispose();
	    } else if (kategoriAdi.equals("Swift")) {
	    	SwiftDetay nw = new SwiftDetay();
            nw.NewScreen_Swift();
            dispose();
	    } else if (kategoriAdi.equals("C++")) {
	    	CPlusDetay2 nw = new CPlusDetay2();
            nw.NewScreen_CPlus();
            dispose();
	    }  else if (kategoriAdi.equals("C#")) {
	    	CSharpDetay nw = new CSharpDetay();
            nw.NewScreen_CSharp();
            dispose();
	    } else if (kategoriAdi.equals("Python")) {
	    	PythonDetay nw = new PythonDetay();
            nw.NewScreen_Python();
            dispose();
	    }
	    else if (kategoriAdi.equals("Ayrık Matematik")) {
	    	DiscreteDetay nw = new DiscreteDetay();
            nw.NewScreen_Discrete();
            dispose();
	    }
	    else if (kategoriAdi.equals("Calculus 1")) {
	    	Calculus1Detay nw = new Calculus1Detay ();
            nw.NewScreen_Calculus1();
            dispose();
	    }
	    else if (kategoriAdi.equals("Calculus 2")) {
	    	Calculus2Detay nw = new Calculus2Detay ();
            nw.NewScreen_Calculus2();
            dispose();
	    }
	    else if (kategoriAdi.equals("Analysis")) {
	    	AnalysisDetay nw = new AnalysisDetay ();
            nw.NewScreen_Analysis();
            dispose();
	    }
	    else if (kategoriAdi.equals("Lineer Algebra")) {
	    	LineerAlgebraDetay nw = new LineerAlgebraDetay ();
            nw.NewScreen_LineerAlgebra();
            dispose();
	    }
	    else if (kategoriAdi.equals("Biochemistry")) {
	    	BiochemistryDetay nw = new BiochemistryDetay ();
            nw.NewScreen_Biochemistry();
            dispose();
	    }
	    else if (kategoriAdi.equals("Geochemistry")) {
	    	GeochemistryDetay nw = new GeochemistryDetay ();
            nw.NewScreen_Geochemistry();
            dispose();
	    }
	    else if (kategoriAdi.equals("Chemical Engineering")) {
	    	ChemicalEngineeringDetay nw = new ChemicalEngineeringDetay ();
            nw.NewScreen_ChemicalEngineering();
            dispose();
	    }
	    else if (kategoriAdi.equals("Material Science")) {
	    	MaterialScienceDetay nw = new MaterialScienceDetay ();
            nw.NewScreen_MaterialScience();
            dispose();
	    }
	    
	}
	}

	

	