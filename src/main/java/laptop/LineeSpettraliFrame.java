package laptop;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class LineeSpettraliFrame {

	public JPanel pannelloPrincipale = new JPanel();
	public JPanel pannelloSuperiore = new JPanel();
	public JPanel pannelloCentrale = new JPanel();

	public JLabel titoloPrincipale = new JLabel();
	public JLabel titoloRicerca = new JLabel();
	
	private JButton backButton = new JButton("Indietro");

	private BackButtonListener back = new BackButtonListener();

	public JLabel sfondo = new JLabel(new ImageIcon("src/main/java/laptop/Home-Background-Galaxy.jpg"));

	
	public LineeSpettraliFrame()
	{}
	
	public void disegnaLineeSpettraliFrame()
	{
		Frame.pulisciInterfaccia();
		
		Frame.getFrame().setSize(900,900);
		Frame.getFrame().setLocation(215,10);
		Frame.getFrame().setResizable(false);
		Frame.getFrame().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
		
		Container c = Frame.getFrame().getContentPane();
		
		pannelloPrincipale.setLayout(null);
		pannelloPrincipale.setSize(Frame.getFrame().getWidth(), Frame.getFrame().getHeight());
		pannelloPrincipale.setLocation(0, 0);

		pannelloSuperiore.setLayout(null);
		pannelloSuperiore.setSize(Frame.getFrame().getWidth(),100);
		pannelloSuperiore.setLocation(5,5);
		pannelloSuperiore.setOpaque(false);
		
		pannelloCentrale.setLayout(null);
		pannelloCentrale.setSize(Frame.getFrame().getWidth(),Frame.getFrame().getHeight()-100);
		pannelloCentrale.setLocation(0,100);
		pannelloCentrale.setOpaque(false);
		
		titoloPrincipale.setFont(new Font("Calibri", Font.BOLD, 25));
		titoloPrincipale.setLocation(5,35);
		titoloPrincipale.setSize(pannelloSuperiore.getWidth(), 25);
		titoloPrincipale.setHorizontalAlignment(JLabel.CENTER);
		titoloPrincipale.setVerticalAlignment(JLabel.CENTER);
		titoloPrincipale.setText("Ricerca Valori Linee Spettrali");
		titoloPrincipale.setForeground(Color.white);


		titoloRicerca.setFont(new Font("Calibri", Font.BOLD, 25));
		titoloRicerca.setLocation(5,50);
		titoloRicerca.setSize(pannelloCentrale.getWidth(), 20);
		titoloRicerca.setHorizontalAlignment(JLabel.CENTER);
		titoloRicerca.setVerticalAlignment(JLabel.CENTER);
		titoloRicerca.setText("Ricerca Valori dei flussi e relativo errore di una o più righe spettrali data la Galassia");
		titoloRicerca.setForeground(Color.white);
		
		
		backButton.setForeground(Color.BLACK);
		backButton.setToolTipText("Torna indietro nell'area di Amministrazione");
		backButton.setBounds(800, 7, 50,30);
		backButton.addActionListener(back);
		backButton.setMargin(new Insets(0,0,0,0));
		
		pannelloSuperiore.add(backButton);
		pannelloSuperiore.add(titoloPrincipale);
		
		pannelloCentrale.add(titoloRicerca);
		
		pannelloPrincipale.add(pannelloSuperiore);
		pannelloPrincipale.add(pannelloCentrale);
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
