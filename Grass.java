import java.awt.Color;
import java.util.ArrayList;

import acm.util.RandomGenerator;

public class Grass extends Plant {
	
	
	public Grass(Location l, World w) {
		super(l,w);
		RandomGenerator rgen = RandomGenerator.getInstance();
		myLifeSpan = rgen.nextInt(4,5);
		myColor=Color.GREEN;
	}
	
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 	
		myWorld.getCreatureList().add(new Grass(new Location(newX,newY), myWorld));
	}
	
}
