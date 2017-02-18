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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class RegisterFrame {

	public JPanel pannelloPrincipale = new JPanel();
	public JPanel pannelloSuperiore = new JPanel();
	public JPanel pannelloCentrale = new JPanel();

	public JLabel titoloPrincipale = new JLabel();
	public JLabel titoloRegistrazione = new JLabel();
	public JLabel titoloRegister = new JLabel();
	public JLabel nameUtente = new JLabel();
	public JLabel surnameUtente = new JLabel();
	public JLabel usernameUtente = new JLabel();
	public JLabel passwordUtente = new JLabel();
	public JLabel emailUtente = new JLabel();
	
	public JTextField textUsername = new JTextField();
	public JTextField textPassword = new JTextField();
	public JTextField textName = new JTextField();
	public JTextField textSurname = new JTextField();
	public JTextField textEmail = new JTextField();
	
	public JLabel sfondo = new JLabel(new ImageIcon("src/main/java/laptop/Home-Background-Galaxy.jpg"));
	private JButton backButton = new JButton("Indietro");
	private BackButtonListener back = new BackButtonListener();
	private JButton registerButton = new JButton("Registrati");
	private RegisterButtonListener register = new RegisterButtonListener();

	
	public RegisterFrame()
	{}
	
	public void disegnaRegisterFrame()
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
		titoloPrincipale.setText("Benvenuto nell'area di Registrazione");
		titoloPrincipale.setForeground(Color.white);

		pannelloCentrale.setLayout(null);
		pannelloCentrale.setSize(Frame.getFrame().getWidth()-100,Frame.getFrame().getHeight()-300);
		pannelloCentrale.setLocation(30, 100);
		pannelloCentrale.setOpaque(false);
		
		titoloRegistrazione.setFont(new Font("Calibri",0,20));
		titoloRegistrazione.setLocation(25, 87);
		titoloRegistrazione.setSize(pannelloCentrale.getWidth(),80);
		titoloRegistrazione.setHorizontalAlignment(JLabel.CENTER);
		titoloRegistrazione.setVerticalAlignment(JLabel.CENTER);
		titoloRegistrazione.setText("Inserisci i dati per effettuare la registrazione");
		titoloRegistrazione.setForeground(Color.white);

		nameUtente.setLocation(150,150);
		nameUtente.setSize(100,50);
		nameUtente.setText("Nome: ");
		nameUtente.setForeground(Color.WHITE);
		
		surnameUtente.setLocation(150,200);
		surnameUtente.setSize(200,50);
		surnameUtente.setText("Cognome: ");
		surnameUtente.setForeground(Color.WHITE);
		
		textName.setLocation(250,160);
		textName.setSize(400,30);
		
		textSurname.setLocation(250, 210);
		textSurname.setSize(400,30);
		
		usernameUtente.setLocation(150,250);
		usernameUtente.setSize(100,50);
		usernameUtente.setText("Username: ");
		usernameUtente.setForeground(Color.WHITE);

		passwordUtente.setLocation(150,300);
		passwordUtente.setSize(200,50);
		passwordUtente.setText("Password: ");
		passwordUtente.setForeground(Color.WHITE);
		
		emailUtente.setLocation(150,350);
		emailUtente.setSize(100,50);
		emailUtente.setText("Email: ");
		emailUtente.setForeground(Color.WHITE);
		
		textUsername.setLocation(250,260);
		textUsername.setSize(400,30);
		
		textPassword.setLocation(250, 310);
		textPassword.setSize(400,30);
		
		textEmail.setLocation(250,360);
		textEmail.setSize(400,30);
		
		registerButton.setForeground(Color.BLACK);
		registerButton.setToolTipText("Registrati alla piattaforma");
        registerButton.setBounds(400, 460, 100, 30);
		registerButton.setMargin (new Insets (0, 0, 0, 0));
		registerButton.addActionListener(register);
		
		backButton.setForeground(Color.BLACK);
		backButton.setToolTipText("Torna indietro nell'area di Login");
		backButton.setBounds(10, 7, 50,30);
		backButton.addActionListener(back);
		backButton.setMargin(new Insets(0,0,0,0));
		
		pannelloSuperiore.add(titoloPrincipale);
		pannelloSuperiore.add(backButton);
		pannelloCentrale.add(titoloRegistrazione);
		pannelloCentrale.add(nameUtente);
		pannelloCentrale.add(surnameUtente);
		pannelloCentrale.add(usernameUtente);
		pannelloCentrale.add(passwordUtente);
		pannelloCentrale.add(textName);
		pannelloCentrale.add(textSurname);
		pannelloCentrale.add(textUsername);
		pannelloCentrale.add(textPassword);	
		pannelloCentrale.add(registerButton);
		pannelloCentrale.add(textEmail);
		pannelloCentrale.add(emailUtente);
		
		pannelloPrincipale.add(pannelloSuperiore);
		pannelloPrincipale.add(pannelloCentrale);
		pannelloPrincipale.add(sfondo);
		
		c.add(pannelloPrincipale);
	
		sfondo.setBounds(0, 0, Frame.getFrame().getWidth(), Frame.getFrame().getHeight());
		Frame.getFrame().setVisible(true);

	}
	
	private class RegisterButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			try
			{
				JOptionPane.showMessageDialog(null, "registrazione effettuata con successo","registrazione", JOptionPane.INFORMATION_MESSAGE);

			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Errore sulla piattaforma, registrazione non effettuata ");
			}
		}
	}
	private class BackButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
				LoginFrame loginFrame = new LoginFrame();
				Frame.pulisciInterfaccia();
				loginFrame.disegnaLoginFrame();
		}
	}
	
}
