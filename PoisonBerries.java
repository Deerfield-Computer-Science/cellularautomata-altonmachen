import java.awt.Color;
import java.util.ArrayList;

public class PoisonBerries extends Plant {
	
	public PoisonBerries(Location l, World w) {
		super(l,w);
		myLifeSpan = 2;
		myColor= Color.MAGENTA;
		species= "Poison Berries";
	}
	
	public void reproduce(int index) {
		int chance = rgen.nextInt(1, 10);
		int x= myWorld.getCreatureList().get(index).getMyLocation().getX();
		x += rgen.nextInt(-1, 1);
		int y= myWorld.getCreatureList().get(index).getMyLocation().getY();
		y += rgen.nextInt(-1, 1);
		Location updated = new Location (x,y);
		if (chance>5) {
				myWorld.getCreatureList().add(new PoisonBerries(updated, myWorld));
		}
	}
	
		public void eat() {
			
		}

		public void move() {
			
		}
}


