import java.awt.Color;

public class Mushroom extends Plant {

	public Mushroom(Location loc, World w) {
		super(loc, w);
		myLifeSpan = 3;
		myColor = Color.RED;
		species= "Mushroom";
	}
	
	public void extendLifeSpan(int i) {
		
		}
	
	public void reproduce(int index) {
		int chance = rgen.nextInt(1, 10);
		int x= myWorld.getCreatureList().get(index).getMyLocation().getX();
		x += rgen.nextInt(-1, 1);
		int y= myWorld.getCreatureList().get(index).getMyLocation().getY();
		y += rgen.nextInt(-1, 1);
		Location updated = new Location (x,y);
		if (chance>5) {
				myWorld.getCreatureList().add(new Mushroom(updated, myWorld));
		}
	}
		public void eat() {
	
			}
		public void move() {
			
		}

}
