package model;

import java.util.Observable;

import contract.IModel;

public class Game extends Observable implements IModel{
	
	private Map map;
	
	public Game(){
		map = new Map();
	}

	public Map getMap(){
		return map;
	}
	private void changed(){
		setChanged();
		notifyObservers();
	}
}
