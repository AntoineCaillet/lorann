package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Element;
import model.Game;

public class Panel extends JPanel implements Observer{
	
	private static final long serialVersionUID = -861320487250584480L;
	
	public View view;
	
	public Panel(View view){

		view.setBackground(Color.BLACK);
		this.view = view;
		((Game) view.getModel()).addObserver(this);
	}
	
	public void paintComponent(Graphics g){
		clearComponant(g);
		for(Element[] element : view.getModel().getMap().getElements()){
			for(Element e : element){
				if(e != null){
					g.drawImage(e.getImage(), e.getX()*32, e.getY()*32, null);
				}
			}
		}
//		Dessin => récupérer le model et la map => boucle x et y pour récupérer les éléments
	}
//		Méthode permettant de clear l'affichage
	public void clearComponant (Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, view.getWidth(), view.getHeight());
	}
	
	public void update(Observable observable, Object object) {
		repaint();
	}
}
