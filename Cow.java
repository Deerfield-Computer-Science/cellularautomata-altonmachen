import java.awt.Color;

import acm.util.RandomGenerator;

public class Cow extends LifeForm {

	public Cow(String species, int myLifeSpan, Location myLocation, Color myColor, World myWorld) {
		super(species,myLifeSpan, myLocation, myColor, myWorld);
	}
	
	public Cow(Location myLocation, World myWorld) {
		super(myLocation,myWorld);
		myColor = Color.BLACK;
		RandomGenerator rgen = RandomGenerator.getInstance();
		myLifeSpan = rgen.nextInt(7,10);
		species="Cow";

	}
	
	public void reproduce() {
		
	}
	
	
	
	public void move(int i) {
		int myX = myWorld.getCreatureList().get(i).getMyLocation().getX();
		int myY = myWorld.getCreatureList().get(i).getMyLocation().getY();
		Location loc = new Location(myX+1, myY+1);
		myWorld.getCreatureList().get(i).setMyLocation(loc);
	}
	
	public void eat(int i) {
		int myX = myWorld.getCreatureList().get(i).getMyLocation().getX();
		int myY = myWorld.getCreatureList().get(i).getMyLocation().getY();
		Location neighbooring1 = new Location(myX+1,myY+1);
		Location neighbooring2 = new Location(myX-1,myY+1);
		Location neighbooring3 = new Location(myX+1,myY-1);
		Location neighbooring4 = new Location(myX-1,myY-1);
		if ((myWorld.getCreatureList().get(i).getMyLocation()==neighbooring1) || (myWorld.getCreatureList().get(i).getMyLocation()==neighbooring2) || (myWorld.getCreatureList().get(i).getMyLocation()==neighbooring3) || (myWorld.getCreatureList().get(i).getMyLocation()==neighbooring4)) {
			myWorld.getCreatureList().remove(i);
//			not sure how to make it so it only eats grass
		}
	}
}
