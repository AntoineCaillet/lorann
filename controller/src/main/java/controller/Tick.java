package controller;

import contract.*;

public class Tick implements Runnable{
	private IView view;
	private IModel model;
	
	public Tick(IView view, IModel model){
		this.view = view;
		this.model = model;
	}
	
	public void setView(IView v){
		view = v;
	}
	public void setModel(IModel m){
		model = m;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
}
