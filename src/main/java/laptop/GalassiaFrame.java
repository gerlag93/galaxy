package laptop;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;




public class GalassiaFrame {

	public String[] segno= {" +"," -"};
	public String[] equal = {">=","<="};
	
	public JPanel pannelloPrincipale = new JPanel();
	public JPanel pannelloSuperiore = new JPanel();
	public JPanel pannelloCentrale = new JPanel();

	public JLabel titoloPrincipale = new JLabel();
	public JLabel titoloGalassia = new JLabel();
	public JLabel titoloGalassia2 = new JLabel();
	public JLabel titoloCoordinate = new JLabel();
	public JLabel titoloCoordinate2 = new JLabel();
	public JLabel titoloRedShift = new JLabel();
	public JLabel titolodi = new JLabel();
	public JLabel titoloHH = new JLabel();
	public JLabel titoloDD = new JLabel();
	public JLabel titoloMMRA = new JLabel();
	public JLabel titoloSSRA = new JLabel();
	public JLabel titoloMMDec = new JLabel();
	public JLabel titoloSSDec = new JLabel();
	public JLabel titoloRA = new JLabel();
	public JLabel titoloDec = new JLabel();
	public JLabel titoloRaggio = new JLabel();
	
	public JTextField textGalassia = new JTextField();
	public JTextField textCoordinateHH = new JTextField();
	public JTextField textCoordinateDD = new JTextField();
	public JTextField textCoordinateMMRA = new JTextField();
	public JTextField textCoordinateMMDec = new JTextField();
	public JTextField textCoordinateSSRA = new JTextField();
	public JTextField textCoordinateSSDec = new JTextField();
	public JTextField textRedshift = new JTextField();
	public JTextField textRaggio = new JTextField();
	
	public JComboBox<String> segnoBox = new JComboBox<String>();
	public JComboBox<String> equalBox = new JComboBox<String>();

	public JTable tabellaGalassie;
	public JScrollPane scrollGalassie;
	
	private JButton backButton = new JButton("Indietro");
	private JButton cercaNome = new JButton("Cerca");
	private JButton cercaCoordinate = new JButton("Cerca");
	private JButton cercaRedshift = new JButton("Cerca");
	
	
	private BackButtonListener back = new BackButtonListener();

	public JLabel sfondo = new JLabel(new ImageIcon("src/main/java/laptop/Home-Background-Galaxy.jpg"));


	public GalassiaFrame()
	{}
	
	public void disegnaTabellaGalassie()
	{
			tabellaGalassie = new JTable(0,0);
			DefaultTableModel modelTabella = (DefaultTableModel)tabellaGalassie.getModel();
			scrollGalassie = new JScrollPane(tabellaGalassie);
			modelTabella.addColumn("Nome");
			modelTabella.addColumn("Distanza");
			modelTabella.addColumn("Coordinate");
			modelTabella.addColumn("Redshift");
			modelTabella.addColumn("Luminosità");
			modelTabella.addColumn("Errore");
			modelTabella.addColumn("Metallicità");
			modelTabella.addColumn("Errore");
	}
	
	public void disegnaGalassiaFrame()
	{
		Frame.pulisciInterfaccia();
		//Frame.getFrame().setSize(1650,900);
		Frame.getFrame().setSize(1700,900);
		Frame.getFrame().setLocation(215,10);
		//Frame.getFrame().setResizable(false);
		//Frame.getFrame().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
		
		Container c = Frame.getFrame().getContentPane();
		
		pannelloPrincipale.setLayout(null);
		pannelloPrincipale.setSize(Frame.getFrame().getWidth(), Frame.getFrame().getHeight());
		pannelloPrincipale.setLocation(0, 0);

		pannelloSuperiore.setLayout(null);
		pannelloSuperiore.setSize(Frame.getFrame().getWidth(),100);
		pannelloSuperiore.setLocation(5,5);
		pannelloSuperiore.setOpaque(false);
		
		pannelloCentrale.setLayout(null);
		pannelloCentrale.setSize(Frame.getFrame().getWidth()-10,750);
		pannelloCentrale.setLocation(5, 75);
		pannelloCentrale.setOpaque(false);
		
		titoloPrincipale.setFont(new Font("Calibri", Font.BOLD, 30));
		titoloPrincipale.setLocation(5,35);
		titoloPrincipale.setSize(pannelloSuperiore.getWidth(),35);
		titoloPrincipale.setHorizontalAlignment(JLabel.CENTER);
		titoloPrincipale.setVerticalAlignment(JLabel.CENTER);
		titoloPrincipale.setText("Ricerca Galassia");
		titoloPrincipale.setForeground(Color.WHITE);
		
		titoloGalassia.setFont(new Font("Calibri",0,20));
		titoloGalassia.setLocation(10, 0);
		titoloGalassia.setSize(pannelloCentrale.getWidth(),80);
		titoloGalassia.setText("Ricerca Galassia per Nome");
		titoloGalassia.setForeground(Color.white);
		
		titoloGalassia2.setFont(new Font("Calibri",0,20));
		titoloGalassia2.setLocation(10, 55);
		titoloGalassia2.setSize(pannelloCentrale.getWidth(),80);
		titoloGalassia2.setText("Nome: ");
		titoloGalassia2.setForeground(Color.white);
		
		textGalassia.setLocation(100,75);
		textGalassia.setSize(180,30);
		
		titoloCoordinate.setFont(new Font("Calibri",0,20));
		titoloCoordinate.setLocation(10,218);
		//titoloCoordinate.setLocation(650, 25);
		titoloCoordinate.setSize(pannelloCentrale.getWidth(),80);
		titoloCoordinate.setText("Ricerca Galassie all'interno di un raggio");
		titoloCoordinate.setForeground(Color.white);
		
		titoloCoordinate2.setFont(new Font("Calibri",0,20));
		titoloCoordinate2.setLocation(10,239);
		titoloCoordinate2.setSize(pannelloCentrale.getWidth(),80);
		titoloCoordinate2.setText("date le Coordinate (RA,Dec)");
		titoloCoordinate2.setForeground(Color.white);
		
		titoloRA.setFont(new Font("Calibri",0,20));
		titoloRA.setLocation(10,315);
		titoloRA.setSize(pannelloCentrale.getWidth(),80);
		titoloRA.setText("RA:");
		titoloRA.setForeground(Color.white);
		
		titoloDec.setFont(new Font("Calibri",0,20));
		titoloDec.setLocation(10,373);
		titoloDec.setSize(pannelloCentrale.getWidth(),80);
		titoloDec.setText("Dec:");
		titoloDec.setForeground(Color.white);
		
		titoloHH.setFont(new Font("Calibri",0,20));
		titoloHH.setLocation(63,275);
		titoloHH.setSize(pannelloCentrale.getWidth(),80);
		titoloHH.setText("HH");
		titoloHH.setForeground(Color.white);
		
		textCoordinateHH.setLocation(50,330);//ex 10
		textCoordinateHH.setSize(50,30);
		
		titoloMMRA.setFont(new Font("Calibri",0,20));
		titoloMMRA.setLocation(140,275);
		titoloMMRA.setSize(pannelloCentrale.getWidth(),80);
		titoloMMRA.setText("MM");
		titoloMMRA.setForeground(Color.white);
		
		textCoordinateMMRA.setLocation(130,330);
		textCoordinateMMRA.setSize(50,30);
		
		titoloSSRA.setFont(new Font("Calibri",0,20));
		titoloSSRA.setLocation(220,275);
		titoloSSRA.setSize(pannelloCentrale.getWidth(),80);
		titoloSSRA.setText("SS");
		titoloSSRA.setForeground(Color.white);
		
		textCoordinateSSRA.setLocation(210,330);
		textCoordinateSSRA.setSize(50,30);

		segnoBox.setLocation(50,390);
		segnoBox.setSize(50,30);
		for(int i=0;i<2;i++)
		{
			segnoBox.addItem(segno[i]);
		}
		
		titoloDD.setFont(new Font("Calibri",0,20));
		titoloDD.setLocation(140,335);
		titoloDD.setSize(pannelloCentrale.getWidth(),80);
		titoloDD.setText("DD");
		titoloDD.setForeground(Color.white);
		
		titoloMMDec.setFont(new Font("Calibri",0,20));
		titoloMMDec.setLocation(220,335);
		titoloMMDec.setSize(pannelloCentrale.getWidth(),80);
		titoloMMDec.setText("MM");
		titoloMMDec.setForeground(Color.white);
		
		titoloSSDec.setFont(new Font("Calibri",0,20));
		titoloSSDec.setLocation(300,335);
		titoloSSDec.setSize(pannelloCentrale.getWidth(),80);
		titoloSSDec.setText("SS");
		titoloSSDec.setForeground(Color.white);
		
		titoloRaggio.setFont(new Font("Calibri",0,20));
		titoloRaggio.setLocation(10,412);
		titoloRaggio.setSize(pannelloCentrale.getWidth(),80);
		titoloRaggio.setText("entro raggio di dimensione R:");
		titoloRaggio.setForeground(Color.white);
		
		textCoordinateDD.setLocation(130,390);
		textCoordinateDD.setSize(50,30);
		
		textCoordinateMMDec.setLocation(210,390);
		textCoordinateMMDec.setSize(50,30);

		textCoordinateSSDec.setLocation(290,390);
		textCoordinateSSDec.setSize(50,30);

		textRaggio.setLocation(290,430);
		textRaggio.setSize(50,30);
		
		titoloRedShift.setFont(new Font("Calibri",0,20));
		//titoloRedShift.setLocation(1100, 25);
		titoloRedShift.setLocation(10,565);
		titoloRedShift.setSize(pannelloCentrale.getWidth(),80);
		titoloRedShift.setText("Ricerca Galassie con valore Redshift ");
		titoloRedShift.setForeground(Color.white);
		
		titolodi.setFont(new Font("Calibri",0,20));
		titolodi.setLocation(100,613);
		titolodi.setSize(pannelloCentrale.getWidth(),80);
		titolodi.setText("di ");
		titolodi.setForeground(Color.white);
		
		equalBox.setLocation(10,633);
		equalBox.setSize(50,30);
		for(int i=0;i<2;i++)
		{
			equalBox.addItem(equal[i]);
		}
		
		textRedshift.setLocation(130,633);
		textRedshift.setSize(60,30);

		cercaNome.setForeground(Color.BLACK);
		cercaNome.setToolTipText("Esegui la ricerca");
		cercaNome.setBounds(10, 113, 67,35);
		cercaNome.setMargin(new Insets(0,0,0,0));
		
		cercaCoordinate.setForeground(Color.BLACK);
		cercaCoordinate.setToolTipText("Esegui la ricerca delle galassie all'interno di un raggio R");
		cercaCoordinate.setBounds(10, 470, 67,35);
		cercaCoordinate.setMargin(new Insets(0,0,0,0));
		
		cercaRedshift.setForeground(Color.BLACK);
		cercaRedshift.setToolTipText("Esegui la ricerca per valore di RedShift");
		cercaRedshift.setBounds(10, 675, 67,35);
		cercaRedshift.setMargin(new Insets(0,0,0,0));

		
		disegnaTabellaGalassie();
		scrollGalassie.setLocation(360,20);
		scrollGalassie.setSize(1308,850);
		
		backButton.setForeground(Color.BLACK);
		backButton.setToolTipText("Torna indietro nell'area di Amministrazione");
		backButton.setBounds(1617, 7, 50,30);
		backButton.addActionListener(back);
		backButton.setMargin(new Insets(0,0,0,0));
		
		
		
		pannelloSuperiore.add(titoloPrincipale);
		pannelloSuperiore.add(backButton);
		
		pannelloCentrale.add(titoloGalassia);
		pannelloCentrale.add(titoloGalassia2);
		pannelloCentrale.add(textGalassia);
		pannelloCentrale.add(titoloCoordinate);
		pannelloCentrale.add(titoloCoordinate2);
		pannelloCentrale.add(textCoordinateHH);
		pannelloCentrale.add(titoloHH);
		pannelloCentrale.add(textCoordinateDD);
		pannelloCentrale.add(titoloDD);
		pannelloCentrale.add(textCoordinateMMRA);
		pannelloCentrale.add(titoloMMRA);
		pannelloCentrale.add(textCoordinateSSRA);
		pannelloCentrale.add(titoloSSRA);
		pannelloCentrale.add(textCoordinateMMDec);
		pannelloCentrale.add(titoloMMDec);
		pannelloCentrale.add(textCoordinateSSDec);
		pannelloCentrale.add(titoloSSDec);
		pannelloCentrale.add(segnoBox);
		pannelloCentrale.add(titoloRA);
		pannelloCentrale.add(titoloDec);
		pannelloCentrale.add(titoloRedShift);
		pannelloCentrale.add(equalBox);
		pannelloCentrale.add(titolodi);
		pannelloCentrale.add(textRedshift);
		pannelloCentrale.add(cercaNome);
		pannelloCentrale.add(cercaCoordinate);
		pannelloCentrale.add(cercaRedshift);
		pannelloCentrale.add(titoloRaggio);
		pannelloCentrale.add(textRaggio);
		pannelloCentrale.add(scrollGalassie);
		
		pannelloPrincipale.add(pannelloCentrale);
		pannelloPrincipale.add(pannelloSuperiore);
		pannelloPrincipale.add(sfondo);
		

		c.add(pannelloPrincipale);
		
		sfondo.setBounds(0, 0, Frame.getFrame().getWidth(), Frame.getFrame().getHeight());
		Frame.getFrame().setVisible(true);

	}
	
	
	private class BackButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
				Frame.pulisciInterfaccia();
				MainFrame main = new MainFrame();
				main.disegnaMainFrame();
		}
	}
}
