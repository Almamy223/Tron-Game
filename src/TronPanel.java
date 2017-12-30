//Aata-allah Rchidi 2000 2436 & Almamy Coulibaly P1004541

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TronPanel extends JComponent {

	public Arene bb;
	public TronControlPanel tron;

	public TronPanel() {
		
		setFocusable(true); 
		
		
		tron = new TronControlPanel();
		System.out.println(tron.comb.getSelectedItem() );
		
		
		Point jp1 = new Point(20, 20);
		Point jp2 = new Point(200, 200);
		JoueurHumain joueur1 = new JoueurHumain(jp1, Color.PINK); 
		JoueurHumain joueur2 = new JoueurHumain(jp2, Color.RED);
		joueur1.nouvelle_direction = Direction.Est ; 
		joueur2.nouvelle_direction = Direction.Est ;
		
		Joueur[] tabJ = { joueur1, joueur2 };
		
		
		
		bb = new Arene(tabJ);
		// ecouteur pour les mouvements
		
		
		bb.addKeyListener(new Mouvement());
		tron.addKeyListener(new Mouvement());
		bb.setFocusable(true);
		tron.setFocusable(true);
		tron.b1.setFocusable(true);
		tron.b1.addKeyListener(new Mouvement());
		tron.b2.setFocusable(true);
		tron.b2.addKeyListener(new Mouvement());
		
		this.setLayout(new BorderLayout());
		
		this.add(tron, BorderLayout.EAST);
		this.add(bb, BorderLayout.CENTER);
		
	}

}
