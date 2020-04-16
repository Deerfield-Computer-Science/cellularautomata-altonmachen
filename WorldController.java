import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class WorldController extends GraphicsProgram {
	
	private World theWorld;
	private GCanvas theWorldCanvas;
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 1000;
	
	public void run(){	
		pause(4500);
		setUpWorld();
		runWorld();
		System.out.println("Finished running main");
	}
	
	public void init(){
	    resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}
	
	public void setUpWorld() {
		theWorld= new World (20,20);
		theWorld.getCreatureList().add(new Grass(new Location(3,6), theWorld ));
		theWorld.getCreatureList().add(new Grass( new Location(4,6), theWorld ));
		theWorld.getCreatureList().add(new Cow( new Location(2,3), theWorld ));
		theWorld.getCreatureList().add(new Cow( new Location(2,2), theWorld ));
		theWorld.getCreatureList().add(new Dinosaur(new Location (10,5), theWorld));
		theWorld.getCreatureList().add(new Dinosaur(new Location (10,6), theWorld));
		theWorld.getCreatureList().add(new Dinosaur(new Location (10,3), theWorld));
		theWorld.getCreatureList().add(new PoisonBerries(new Location (2,5), theWorld));
		theWorld.getCreatureList().add(new Mushroom(new Location (1,5), theWorld));
		theWorld.getCreatureList().add(new Finch(new Location (3,2), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (1,1), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (0,0), theWorld));
		theWorld.getCreatureList().add(new Human(new Location (0,2), theWorld));
		theWorld.getCreatureList().add(new Flower(new Location (1,3), theWorld));
		theWorldCanvas = this.getGCanvas();
	}
	
	public void runWorld(){
		drawWorld();
		for(int i=0; i<20;i++){
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
