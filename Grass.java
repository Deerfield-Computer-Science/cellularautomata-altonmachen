import java.awt.Color;
import java.util.ArrayList;

import acm.util.RandomGenerator;

public class Grass extends Plant {
	
	
	public Grass(Location l, World w) {
		super(l,w);
		RandomGenerator rgen = RandomGenerator.getInstance();
		myLifeSpan = rgen.nextInt(4,5);
		myColor=Color.GREEN;
		species = "Grass";
	}
	
	public void reproduce(int index) {
		int chance = rgen.nextInt(1, 10);
		int x= myWorld.getCreatureList().get(index).getMyLocation().getX();
		x += rgen.nextInt(-1, 1);
		int y= myWorld.getCreatureList().get(index).getMyLocation().getY();
		y += rgen.nextInt(-1, 1);
		Location updated = new Location (x,y);
		if (chance>5) {
				myWorld.getCreatureList().add(new Grass(updated, myWorld));
		}
	}
	
	public void eat() {
		
	}
	
	public void move() {
		
	}
}
