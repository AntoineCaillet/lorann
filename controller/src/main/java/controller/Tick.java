package controller;


public class Tick implements Runnable{
	private Controller controller;
	
	
	public Tick(Controller controller){
		this.controller = controller;
	}
	
	public void run() 
	{
		while(true)
		{
			try
			{
				Thread.sleep(1000);
				controller.update();
			}catch(Exception e){}
		}
	}
	
}
