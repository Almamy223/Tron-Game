import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TronControlPanel extends JPanel {
	
	 
	 // composante
	private static final long serialVersionUID = 1L;
	public JButton b1;
	public JButton b2;
	public JButton b3;
	public JLabel label;
	public JPanel top ;
	public JComboBox<String> comb  ; 
	public JTextField text ; 

	
	
	public TronControlPanel() {      // constructeur TronControlPanel
		b1 = new JButton("Demarrer");
		b2 = new JButton("Pause");
		b3 = new JButton("Nouvelle partie");
		
		label = new JLabel("");
		
		text = new JTextField("mls");
		text.setForeground(Color.ORANGE);
		text.setSize(10, 20);
		
		String[] tab = { "2 joueurs humains", "1 humain contre 1 ordinateur",
				"2 humains 1 ordinateur" };
		 comb = new JComboBox<String>(tab);
		 comb.setSize(20, 20);

		
		
		top = new JPanel();
		top.setLayout(new BoxLayout(top, BoxLayout.PAGE_AXIS));
		top.add(label);
		top.add(b1);
		top.add(b2);
		top.add(b3);
		top.add(text);
		top.add(comb);
		this.add(top);

	}
}