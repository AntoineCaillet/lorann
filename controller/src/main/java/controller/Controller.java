package controller;

import contract.*;
import model.Entite;

public class Controller implements IController{
	private IView view;
	private IModel model;
	
	public Controller(IView view, IModel model){
		this.view = view;
		this.model = model;
		
		Thread t = new Thread(new Tick(this));
		t.start();
	}
	
	public void update(){
		//UPDATE TOUT LE MONDE
		for(Entite e : model.getMap().getEntities()){
			e.update();
		}
	}

	
	public void seekandDestroy()
	{
		/*En travaux */
	}
	public void pathFinding()
	{
		
	}
	
	public int deplacement(int x, int y){
		
		return 0;		
	}
	
	public void setView(IView v){
		view = v;
	}
	public void setModel(IModel m){  
		model = m;
	}

	public IView getView() {
		return view;
	}

	public IModel getModel() {
		return model;
	}
}
