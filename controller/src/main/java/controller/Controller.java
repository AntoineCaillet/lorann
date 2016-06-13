package controller;

import contract.*;

public class Controller implements IController{
	private IView view;
	private IModel model;
	
	public Controller(IView view, IModel model){
		this.view = view;
		this.model = model;
	}
	
	public void setView(IView v){
		view = v;
	}
	public void setModel(IModel m){
		model = m;
	}
}
