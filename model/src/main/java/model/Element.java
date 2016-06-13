package model;

import java.awt.Image;

public class Element {
	private Image image;
	private int x, y;
	
	public Element(Image image, int x, int y){
		this.image = image;
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setImage(Image image){
		this.image = image;
	}
	public Image getImage(){
		return image;
	}
}
