//Aata-allah Rchidi 2000 2436 & Almamy Coulibaly P1004541

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Mouvement implements KeyListener {

	
	static char derMov ='p';
	
	public Mouvement() {}

	
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		
		
		// directions Nord, Est, Sud, Ouest correspond à R,S,Z,A pour le joueur 1
		

		switch (c) {
		case 'r':
			if (derMov != 'z'){
			Arene.joueurs[0].trace.allonge('N');
			Arene.joueurs[0].nouvelle_direction = Direction.Nord;
			derMov = 'r';}

			break;
		case 's':
			if (derMov != 'a'){
			Arene.joueurs[0].trace.allonge('E');
			Arene.joueurs[0].nouvelle_direction = Direction.Est;
			derMov = 's';}

			break;
		case 'z':
			if (derMov != 'r'){
			Arene.joueurs[0].trace.allonge('S');
			Arene.joueurs[0].nouvelle_direction = Direction.Sud;
			derMov = 'z';}

			break;
		case 'a':
			if (derMov != 's'){
			Arene.joueurs[0].trace.allonge('O');
			Arene.joueurs[0].nouvelle_direction = Direction.Ouest;
			derMov = 'a';}

			break;
			
			
			// Joueur 2 
			// directions Nord, Est, Sud, Ouest correspond à I,K,M,J pour le joueur 2
		
		
		case 'i':
			if (derMov != 'm'){
			Arene.joueurs[1].trace.allonge('N');
			Arene.joueurs[1].nouvelle_direction = Direction.Nord;
			derMov = 'i';
			}
			break;
		case 'k':
			if (derMov != 'j'){
			Arene.joueurs[1].trace.allonge('E');
			Arene.joueurs[1].nouvelle_direction = Direction.Est;
			derMov = 'k';}
			break;
		case 'm':
			if (derMov != 'i'){
			Arene.joueurs[1].trace.allonge('S');
			Arene.joueurs[1].nouvelle_direction = Direction.Sud;
			derMov = 'm';}
			break;
		case 'j':
			if (derMov != 'k'){
			Arene.joueurs[1].trace.allonge('O');
			Arene.joueurs[1].nouvelle_direction = Direction.Ouest;
			derMov = 'j';}
			break;

		default:
			break;
		}

		

		Point tete = Arene.joueurs[1].trace.PointTete();
		System.out.println(tete.getPointX() + "ds" + tete.getPointY());

		System.out.println("Caractère: " + c);
	}

	
	public void keyPressed(KeyEvent e) {}

	
	public void keyReleased(KeyEvent e) {}

}
