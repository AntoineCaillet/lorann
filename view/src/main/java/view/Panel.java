package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Panel extends JPanel implements Observer{
	
	public Panel(View view){

		view.setBackground(Color.BLACK);
		repaint();
	}
	
	public void paintComponent(Graphics g){

		g.setColor(Color.red);
		g.drawString("ok sa fonctionne !", 50, 50);

		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 640, 480);
		g.fillRect(0, 0, 640, 480);

//		Méthode clean => mettre rectangle noir
//		Dessin => récupérer le model et la map => boucle x et y pour récupérer les éléments
	}
	
	public void update(Observable observable, Object object) {
		repaint();
	}

}
