
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JoueurOrdinateur extends Joueur {

	// Constructeur JoueurOrdinateur
	public JoueurOrdinateur(Point p) {
		super.couleur = Color.RED;
		super.trace = new Trace(p);
		super.vivant = true;
	}

}
