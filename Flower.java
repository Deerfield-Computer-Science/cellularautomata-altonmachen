import java.awt.Color;
import java.util.ArrayList;

public class Flower extends Plant {
	
	public Flower(Location l, World w) {
		super(l,w);
		myLifeSpan = 2;
		myColor= Color.YELLOW;
		species= "Flower";
	}
	
	public void reproduce(int index) {
		int chance = rgen.nextInt(1, 10);
		int x= myWorld.getCreatureList().get(index).getMyLocation().getX();
		x += rgen.nextInt(-1, 1);
		int y= myWorld.getCreatureList().get(index).getMyLocation().getY();
		y += rgen.nextInt(-1, 1);
		Location updated = new Location (x,y);
		if (chance>5) {
				myWorld.getCreatureList().add(new Flower(updated, myWorld));
		}
	}

		public void eat() {
	
			}
		
		public void move() {
			
		}

}