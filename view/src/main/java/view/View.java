package view;

import javax.swing.JFrame;

import contract.IController;
import contract.IModel;
import contract.IView;

public class View extends JFrame implements IView{
	private String title;
	private IController controller;
	
	public View(IModel model, String title){
		setTitle(title);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new Panel(this));
		setVisible(true);
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
