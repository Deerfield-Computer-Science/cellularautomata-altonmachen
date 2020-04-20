import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class WorldController extends GraphicsProgram {
	
	private World theWorld;
	private World newWorld;
	private GCanvas theWorldCanvas;
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 1000;
	
	public void run(){	
		setUpWorld();
		runWorld();
		System.out.println("Finished running main");
	}
	
	public void init(){
	    resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}
	
	public void setUpWorld() {
		theWorld= new World (20,20);
		newWorld= new World (20,20);
		theWorld.getCreatureList().add(new Grass(new Location(3,6), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(4,6), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(11,6), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(12,6), theWorld ));
		theWorld.getCreatureList().add(new Grass(new Location(10,5), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(1,13), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(8,10), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(1,13), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(12,5), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(7,8), theWorld ));
		theWorld.getCreatureList().add(new Cow( new Location(2,2), theWorld ));
		theWorld.getCreatureList().add(new Cow( new Location(4,2), theWorld ));
		theWorld.getCreatureList().add(new Cow( new Location(2,5), theWorld ));
		theWorld.getCreatureList().add(new Dinosaur(new Location (3,12), theWorld));
		theWorld.getCreatureList().add(new Dinosaur(new Location (9,6), theWorld));
		theWorld.getCreatureList().add(new Dinosaur(new Location (2,4), theWorld));
		theWorld.getCreatureList().add(new Dinosaur(new Location (2,13), theWorld));
		theWorld.getCreatureList().add(new Dinosaur(new Location (8,7), theWorld));
		theWorld.getCreatureList().add(new Dinosaur(new Location (9,7), theWorld));
		theWorld.getCreatureList().add(new PoisonBerries(new Location (6,4), theWorld));
		theWorld.getCreatureList().add(new PoisonBerries(new Location (6,5), theWorld));
		theWorld.getCreatureList().add(new PoisonBerries(new Location (3,9), theWorld));
		theWorld.getCreatureList().add(new PoisonBerries(new Location (8,4), theWorld));
		theWorld.getCreatureList().add(new PoisonBerries(new Location (7,5), theWorld));
		theWorld.getCreatureList().add(new PoisonBerries(new Location (10,9), theWorld));
		theWorld.getCreatureList().add(new Mushroom(new Location (1,5), theWorld));
		theWorld.getCreatureList().add(new Mushroom(new Location (4,9), theWorld));
		theWorld.getCreatureList().add(new Mushroom(new Location (10,5), theWorld));
		theWorld.getCreatureList().add(new Mushroom(new Location (14,9), theWorld));
		theWorld.getCreatureList().add(new Mushroom(new Location (12,5), theWorld));
		theWorld.getCreatureList().add(new Mushroom(new Location (11,9), theWorld));
		theWorld.getCreatureList().add(new Finch(new Location (3,2), theWorld));
		theWorld.getCreatureList().add(new Finch(new Location (3,10), theWorld));
		theWorld.getCreatureList().add(new Finch(new Location (12,6), theWorld));
		theWorld.getCreatureList().add(new Finch(new Location (8,7), theWorld));
		theWorld.getCreatureList().add(new Finch(new Location (4,2), theWorld));
		theWorld.getCreatureList().add(new Finch(new Location (7,4), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (12,1), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (0,2), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (7,10), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (0,15), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (1,13), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (2,12), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (1,3), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (10,8), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (10,9), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (11,3), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (4,8), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (6,9), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (1,3), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (14,8), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (2,9), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (0,3), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (2,8), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (10,9), theWorld));
		
		theWorldCanvas = this.getGCanvas();
	}
	
	public void runWorld(){
		drawWorld();
		for(int i=0; i<50;i++){
			theWorld.letTimePass();
			pause(500);
			drawWorld();
		}
	}	
	
	public void drawWorld(){
		drawBlankWorld();
		drawCreatures();
	}
	
	public void drawBlankWorld(){
		for(int row = 0 ; row<theWorld.getWidth(); row++)
			for(int col=0; col<theWorld.getHeight(); col++){
				GRect r = new GRect(row*50, col*50, 50, 50);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
	}
	
	public void drawCreatures(){
		for(LifeForm x: theWorld.getCreatureList()){
			GRect r = new GRect (x.getMyLocation().getX()*50, x.getMyLocation().getY()*50,50,50);
			r.setFillColor(x.getMyColor());
			r.setFilled(true);
			theWorldCanvas.add(r);
		}
	}
}
