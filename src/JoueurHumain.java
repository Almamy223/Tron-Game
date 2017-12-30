
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JoueurHumain extends Joueur {

	// Constructeur joueurHumain
	public JoueurHumain(Point p, Color c) {
		super.couleur = c;
		super.trace = new Trace(p);
		super.vivant = true;
	
	}

}
