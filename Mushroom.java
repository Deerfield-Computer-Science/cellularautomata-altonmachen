import java.awt.Color;

public class Mushroom extends Plant {

	public Mushroom(Location loc, World w) {
		super(loc, w);
		myLifeSpan = 3;
		myColor = Color.RED;
	}
	
	public void extendLifeSpan(int i) {
		if(myWorld.getCreatureList().indexOf(i).isDead==true) {
			myLifeSpan+=1;
		}
	}
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		myWorld.getCreatureList().add(new Mushroom(new Location(newX,newY), myWorld));
	}

}
