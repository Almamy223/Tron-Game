//Aata-allah Rchidi 2000 2436 & Almamy Coulibaly P1004541

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Arene extends JComponent {
	private int largeur_grille, hauteur_grille;
	public static Joueur[] joueurs; // trace des joueurs
	private Trace enceinte;

	public Arene(Joueur[] playeur) {
		this.largeur_grille = 500;
		this.hauteur_grille = 500;
		joueurs = playeur;

	}

	public void paintComponent(Graphics g)    // fonction permettant de dessiner l'Arene
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0,0, largeur_grille, hauteur_grille); 		
		g.drawLine(0, 0, largeur_grille, 0);
		g.drawLine(largeur_grille, 0, largeur_grille, hauteur_grille);
		g.drawLine(largeur_grille, hauteur_grille, 0, hauteur_grille);
		g.drawLine(0, hauteur_grille, 0, 0);
		g.setColor(Color.blue);
		
		
		
		//dessiner la trace des joueurs dans l'ARENE
		for (int i = 0; i < joueurs.length; i++) {
		    Joueur j = joueurs[i];
		
		    g.setColor(j.couleur);
		    
			for (int k = 0; k < j.trace.segments.size(); k++) {
			
			int xdeb = ((Segment)(j.trace.segments.get(k))).getPointDebut().getPointX() ;
			int ydeb = ((Segment)(j.trace.segments.get(k))).getPointDebut().getPointY() ;
			int xfin = ((Segment)(j.trace.segments.get(k))).getPointFin().getPointX() ;
			int yfin = ((Segment)(j.trace.segments.get(k))).getPointFin().getPointY() ;
			
			System.out.println(xdeb+":"+ydeb+"||"+xfin+":"+yfin);
			
			for (int z = 0; z < joueurs.length; z++) {
				if (z != i ) {
					Joueur j3 = joueurs[z];  
				
			for (int l = 0; l < j3.trace.segments.size(); l++) {
				
					 
				int xfirst = ((Segment)(j3.trace.segments.get(l))).getPointDebut().getPointX() ;
				int yfirst = ((Segment)(j3.trace.segments.get(l))).getPointDebut().getPointY() ;
				int xlast = ((Segment)(j3.trace.segments.get(l))).getPointFin().getPointX() ;
				int ylast = ((Segment)(j3.trace.segments.get(l))).getPointFin().getPointY() ;
				
				// gestion de colision
				
				if ( xfin == xlast && yfin == ylast) {
					System.out.println("mort Joueur == "+j+"gagn="+l) ;
					j.vivant=false;
					
					Point jPoint = new Point(0, 0);
					JoueurHumain jouer = new JoueurHumain(jPoint, Color.WHITE); 
					Arene.joueurs[z]=jouer;

				}
			}
			}
			}
			
			if(xfin <= 0 || yfin <= 0 || xfin >= largeur_grille || yfin >=hauteur_grille ){
				j.vivant = false ; 
				System.out.println("joueur mort face au mur :"+i);
			}
				
				
			if ( j.vivant == true ) g.drawLine(xdeb, ydeb, xfin, yfin);
			}
				

		    
		    
		}
		
	}
}
