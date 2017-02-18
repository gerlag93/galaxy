package laptop;

import javax.swing.JFrame;

public class Frame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Frame frame;
	
	private Frame(String titolo)
	{
		super(titolo);
	}
	
	public static Frame getFrame()
	{
		if (frame==null)
			frame = new Frame("Application");
		return frame;
	}
	
	
	public static void pulisciInterfaccia()
	{
		frame.getContentPane().removeAll();
		frame.getContentPane().validate();
		frame.getContentPane().repaint();
	}
	
	
}