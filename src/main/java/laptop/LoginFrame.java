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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;




public class LoginFrame {


	public JPanel pannelloPrincipale = new JPanel();
	public JPanel pannelloSuperiore = new JPanel();
	public JPanel pannelloCentrale = new JPanel();
	
	public JLabel titoloPrincipale = new JLabel();
	public JLabel titoloLogin = new JLabel();
	public JLabel titoloRegister = new JLabel();
	public JLabel usernameUtente = new JLabel();
	public JLabel passwordUtente = new JLabel();
	
	public JTextField textUsername = new JTextField();
	public JPasswordField textPassword = new JPasswordField();

	private JButton loginButton = new JButton("Accedi");
	private JButton registerButton = new JButton("Registrati");
	
	private LoginButtonListener login = new LoginButtonListener();
	private RegisterButtonListener register = new RegisterButtonListener();


	public JLabel sfondo = new JLabel(new ImageIcon("src/main/java/laptop/Home-Background-Galaxy.jpg"));
	
	public LoginFrame()
	{}
	
	public void disegnaLoginFrame()
	{
		
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
		titoloPrincipale.setText("Benvenuto nell'area Login dell' applicazione");
		titoloPrincipale.setForeground(Color.white);

		pannelloCentrale.setLayout(null);
		pannelloCentrale.setSize(Frame.getFrame().getWidth()-100,Frame.getFrame().getHeight()-300);
		pannelloCentrale.setLocation(30, 100);
		pannelloCentrale.setOpaque(false);

		titoloLogin.setFont(new Font("Calibri",0,20));
		titoloLogin.setLocation(25, 87);
		titoloLogin.setSize(pannelloCentrale.getWidth(),80);
		titoloLogin.setHorizontalAlignment(JLabel.CENTER);
		titoloLogin.setVerticalAlignment(JLabel.CENTER);
		titoloLogin.setText("Inserisci le tue credenziali per accedere");
		titoloLogin.setForeground(Color.white);

		usernameUtente.setLocation(150,150);
		usernameUtente.setSize(100,50);
		usernameUtente.setText("Username: ");
		usernameUtente.setForeground(Color.WHITE);
		
		passwordUtente.setLocation(150,200);
		passwordUtente.setSize(200,50);
		passwordUtente.setText("Password: ");
		passwordUtente.setForeground(Color.WHITE);
		
		textUsername.setLocation(250,160);
		textUsername.setSize(400,30);
		
		textPassword.setLocation(250, 210);
		textPassword.setSize(400,30);
		
		loginButton.setForeground(Color.BLACK);
		loginButton.setToolTipText("Effettua il Login");
        loginButton.setBounds(400, 260, 100, 30);
		loginButton.setMargin (new Insets (0, 0, 0, 0));
		loginButton.addActionListener(login);
		
		titoloRegister.setFont(new Font("Calibri",0,20));
		titoloRegister.setLocation(25, 387);
		titoloRegister.setSize(pannelloCentrale.getWidth(),80);
		titoloRegister.setHorizontalAlignment(JLabel.CENTER);
		titoloRegister.setVerticalAlignment(JLabel.CENTER);
		titoloRegister.setText("Sei un nuovo utente? Effettua la Registrazione!");
		titoloRegister.setForeground(Color.white);
		
		registerButton.setForeground(Color.BLACK);
		registerButton.setToolTipText("Registrati alla piattaforma");
        registerButton.setBounds(400, 460, 100, 30);
		registerButton.setMargin (new Insets (0, 0, 0, 0));
		registerButton.addActionListener(register);
		

		
		pannelloSuperiore.add(titoloPrincipale);
		pannelloCentrale.add(titoloLogin);
		pannelloCentrale.add(usernameUtente);
		pannelloCentrale.add(passwordUtente);
		pannelloCentrale.add(textUsername);
		pannelloCentrale.add(textPassword);
		pannelloCentrale.add(loginButton);
		pannelloCentrale.add(titoloRegister);
		pannelloCentrale.add(registerButton);

		pannelloPrincipale.add(pannelloSuperiore);
		pannelloPrincipale.add(pannelloCentrale);
		pannelloPrincipale.add(sfondo);

		c.add(pannelloPrincipale);

		sfondo.setBounds(0, 0, Frame.getFrame().getWidth(), Frame.getFrame().getHeight());
		Frame.getFrame().setVisible(true);
	}
	
	
	private class LoginButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			try
			{
				//controllore, user id min 6 car; if admin || if utente
				MainFrame mainFrame = new MainFrame();
				mainFrame.disegnaMainFrame();
				JOptionPane.showMessageDialog(null, "procedi al login","login", JOptionPane.INFORMATION_MESSAGE);
				
			
				
				
				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, " Password o Username Errate. Riprova", "Password", JOptionPane.ERROR_MESSAGE);
			}
			

			
		}

	}
	
	private class RegisterButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			try
			{
				JOptionPane.showMessageDialog(null, "procedi alla registrazione","registrazione", JOptionPane.INFORMATION_MESSAGE);
				RegisterFrame register = new RegisterFrame();
				register.disegnaRegisterFrame();
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Errore sulla piattaforma, riprovare");
			}
		}
	}
	
	
	
}
