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





public class MainFrame {

	public JPanel pannelloPrincipale = new JPanel();
	public JPanel pannelloSuperiore = new JPanel();
	public JPanel pannelloCentrale = new JPanel();

	
	private JButton galassiaButton = new JButton("Ricerca Galassia");
	private JButton	righeButton = new JButton("Ricerca Valori delle linee Spettrali");
	private JButton rapportoButton = new JButton("Ricerca rapporto tra flusso e continuo");
	private JButton rapportoRigheButton = new JButton("Ricerca Valori rapporti delle Righe");
	private JButton logoutButton = new JButton("Logout");
	
	private LogoutButtonListener logout = new LogoutButtonListener();
	private GalassiaButtonListener galassia = new GalassiaButtonListener();
	private RigheButtonListener righe = new RigheButtonListener();
	private RapportoButtonListener rapporto = new RapportoButtonListener();
	private RapportoRigheButtonListener rapportoR = new RapportoRigheButtonListener();
	
	public JLabel titoloPrincipale = new JLabel();

	public JLabel sfondo = new JLabel(new ImageIcon("src/main/java/laptop/Home-Background-Galaxy.jpg"));

public MainFrame()
{}

public void disegnaMainFrame()
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
	
	titoloPrincipale.setFont(new Font("Calibri", Font.BOLD, 25));
	titoloPrincipale.setLocation(5,35);
	titoloPrincipale.setSize(pannelloSuperiore.getWidth(), 25);
	titoloPrincipale.setHorizontalAlignment(JLabel.CENTER);
	titoloPrincipale.setVerticalAlignment(JLabel.CENTER);
	titoloPrincipale.setText("Benvenuto nel portale");
	titoloPrincipale.setForeground(Color.white);

	logoutButton.setForeground(Color.BLACK);
	logoutButton.setToolTipText("Effettua il logout dall'area ");
	logoutButton.setBounds(800, 7, 50,30);
	logoutButton.addActionListener(logout);
	logoutButton.setMargin(new Insets(0,0,0,0));
	
	pannelloCentrale.setLayout(null);
	pannelloCentrale.setSize(Frame.getFrame().getWidth(),Frame.getFrame().getHeight()-100);
	pannelloCentrale.setLocation(0,100);
	pannelloCentrale.setOpaque(false);
	
	
	
	galassiaButton.setForeground(Color.BLACK);
	galassiaButton.setBounds(250,0,400,100);
	galassiaButton.setMargin(new Insets(0,0,0,0));
	galassiaButton.addActionListener(galassia);
	
	rapportoRigheButton.setForeground(Color.BLACK);
	rapportoRigheButton.setBounds(250,300,400,100);
	rapportoRigheButton.setMargin(new Insets(0,0,0,0));
	rapportoRigheButton.addActionListener(rapportoR);
	
	righeButton.setForeground(Color.BLACK);
	righeButton.setBounds(250,150,400,100);
	righeButton.setMargin(new Insets(0,0,0,0));
	righeButton.addActionListener(righe);
	
	rapportoButton.setForeground(Color.BLACK);
	rapportoButton.setBounds(250,450,400,100);
	rapportoButton.setMargin(new Insets(0,0,0,0));
	rapportoButton.addActionListener(rapporto);
	
	pannelloSuperiore.add(titoloPrincipale);
	pannelloSuperiore.add(logoutButton);
	
	pannelloCentrale.add(galassiaButton);
	pannelloCentrale.add(righeButton);
	pannelloCentrale.add(rapportoButton);
	pannelloCentrale.add(rapportoRigheButton);
	pannelloPrincipale.add(pannelloSuperiore);
	pannelloPrincipale.add(pannelloCentrale);
	pannelloPrincipale.add(sfondo);

	c.add(pannelloPrincipale );
	
	sfondo.setBounds(0, 0, Frame.getFrame().getWidth(), Frame.getFrame().getHeight());
	Frame.getFrame().setVisible(true);
}





private class LogoutButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		Frame.pulisciInterfaccia();
		LoginFrame login = new LoginFrame();
		login.disegnaLoginFrame();
	}
}

private class GalassiaButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		GalassiaFrame galassia = new GalassiaFrame();
		galassia.disegnaGalassiaFrame();
		
	}
}
	
private class RigheButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		LineeSpettraliFrame lineespettrali = new LineeSpettraliFrame();
		lineespettrali.disegnaLineeSpettraliFrame();
		
	}
}



private class RapportoButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
		RapportoFlussoContinuoFrame rapportofc = new RapportoFlussoContinuoFrame();
		rapportofc.disegnaRapportoFlussoContinuoFrame();
		
	}
}

private class RapportoRigheButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent evt)
	{
				RapportoRigheFrame rapportorighe = new RapportoRigheFrame();
				rapportorighe.disegnaRapportoRigheSpettraliFrame();
	}
}

	
}