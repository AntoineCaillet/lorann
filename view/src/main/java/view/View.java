package view;

import javax.swing.JFrame;

import contract.IController;
import contract.IModel;
import contract.IView;

public class View extends JFrame implements IView{
	private static final long serialVersionUID = 8052333814724401335L;
	
	private String title;
	private IController controller;
	private IModel model;
	
	public View(IModel model, String title){
		this.model = model;
		setTitle(title);
		setSize(660, 404);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new Panel(this));
		setVisible(true);
		
	}
	
	public IModel getModel(){
		return model;
	}
	
	public void setController(IController c){
		controller = c;
	}
	
	protected IController getController(){
		return controller;
	}
	
	public void setTitle(String t){
		title = t;
	}
	public String getTitle(){
		return title;
	}
}
