package model;

import java.util.ArrayList;

public class Map {
	private ArrayList<Entite> entities;
	private Element[][] elements;
	
	public Map(){
		entities = new ArrayList<Entite>();
		elements = new Element[15][15];
	}
	
	public void setElement(int x, int y, Element element){
		elements[x][y] = element;
	}

	public Element[][] getElements(){
		return elements;
	}
	public Element getElement(int x, int y){
		return elements[x][y];
	}
	
	public ArrayList<Entite> getEntities(){
		return entities;
	}
	
	public Entite getEntite(int id){
		return entities.get(id);
	}
	
	public void addEntite(Entite entite){
		entities.add(entite);
	}
}
