import java.awt.Color;

public class Human extends LifeForm {

	public Human(int myLifeSpan, Location myLocation, Color myColor, World myWorld) {
		super(myLifeSpan, myLocation, myColor, myWorld);
	}
	
	public Human(Location myLocation,World myWorld) {
		super(myLocation, myWorld);
	}

	@Override
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		myWorld.getCreatureList().add(new Human(new Location(newX,newY), myWorld));
		
	}

}
