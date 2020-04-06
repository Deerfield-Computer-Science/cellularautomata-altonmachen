import java.awt.Color;

import acm.util.RandomGenerator;

public class Cow extends LifeForm {

	public Cow(Location myLocation, World myWorld) {
		super(myLocation,myWorld);
		RandomGenerator rgen = RandomGenerator.getInstance(); 
		int color = rgen.nextInt(0,1);
		if (color==0) {
		myColor = Color.WHITE;
		}
		else if (color==1) {
			myColor = Color.BLACK;
		}
		myLifeSpan = rgen.nextInt(7,10);

	}
	@Override
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		myWorld.getCreatureList().add(new Cow(new Location(newX,newY), myWorld));
	}
	
	public void move(int i) {
		int myX = myWorld.getCreatureList().get(i).getMyLocation().getX();
		int myY = myWorld.getCreatureList().get(i).getMyLocation().getY();
		Location loc = new Location(myX+1, myY+1);
		myWorld.getCreatureList().get(i).setMyLocation(loc);
	}
	
	public void eatGrass() {
	
	}

}
