package Lorann.lorann;

import controller.Controller;
import model.Game;
import view.View;

public class Main 
{
    public static void main( String[] args )
    {
    	Game game = new Game();
    	View view = new View(game, "Lorann");
    	Controller controller = new Controller(view, game);
    	view.setController(controller);
    	
    }
}
