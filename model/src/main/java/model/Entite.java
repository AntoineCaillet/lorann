package model;

public class Entite {
	private int x, y;
	
	public Entite(){
		x = 0;
		y = 0;
	}
	
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void update(){
		
	}
}
