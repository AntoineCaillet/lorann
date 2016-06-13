package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;

import bdd.BDD;
import contract.IModel;
import model.manager.image.ManagerImage;

public class Game extends Observable implements IModel{
	
	private Map map;
	private ManagerImage managerImage;
	private BDD bdd;
	
	public Game(){
		bdd = new BDD();
		managerImage = new ManagerImage(bdd);
		map = new Map();
		initMap(0);
	}
	
	private void initMap(int i) {
		try {
			ResultSet result = bdd.query("{call getMapID(?)}", 1);
			while(result.next()){
				int x = result.getInt("x");
				int y = result.getInt("y");
				map.setElement(x, y, new Element(managerImage.getHashMap().get(result.getInt("idElement")), x, y));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		changed();
	}

	public Map getMap(){
		return map;
	}
	
	public void changed(){
		setChanged();
		notifyObservers();
	}
}
