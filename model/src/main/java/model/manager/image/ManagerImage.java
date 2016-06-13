package model.manager.image;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.ImageIcon;

import bdd.BDD;

public class ManagerImage {
	private HashMap<Integer, Image> images;
//	private BDD bdd;
	
	public ManagerImage(BDD bdd){
		images = new HashMap<Integer, Image>();
		try {
			ResultSet result = bdd.query("{call selectElementAll()}");
			while(result.next()){
				images.put(result.getInt("id"), new ImageIcon(result.getString("url")).getImage());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public HashMap<Integer, Image> getHashMap(){
		return images;
	}
}
