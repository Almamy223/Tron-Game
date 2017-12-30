//Aata-allah Rchidi 2000 2436 & Almamy Coulibaly P1004541

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Tron {

	public Tron() {
		final JFrame f = new JFrame("JEU De TRON"); // fenêtre
		final TronPanel sey = new TronPanel();
		f.addWindowFocusListener(new WindowAdapter() {
			public void windowGainedFocus(WindowEvent e) {
				sey.bb.requestFocusInWindow();
			}
		});

		f.add(sey);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 550);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
		f.setLocation(x, y);
		f.setVisible(true);
 
		// timer pour le ticks d'horloge
		
		final Timer horloge = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				Arene.joueurs[0].trace
						.allonge(Arene.joueurs[0].nouvelle_direction.toString()
								.charAt(0));
				Arene.joueurs[1].trace
						.allonge(Arene.joueurs[1].nouvelle_direction.toString()
								.charAt(0));
				sey.repaint();
			}
		});
		horloge.start();

		// detection d'action sur les boutton
		sey.tron.b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Nouvelle la Partie");
				f.dispose();
				new Tron() ;
				
			}
		});
		
		
		sey.tron.b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pause Partie");
				horloge.stop();
			}
		});
		
		
		sey.tron.b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Demarer la Partie");
				horloge.start();
				
			}
		});
		
		
	}

	public static void main(String[] args) {
		
		Tron papi = new Tron() ; 
		
		
		
	}
}
