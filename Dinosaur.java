import java.awt.Color;

import acm.util.RandomGenerator;

public class Dinosaur extends Animal {

	public Dinosaur(Location myLocation, World myWorld) {
		super(myLocation,myWorld);
		myColor= Color.BLUE;
		myLifeSpan = 20;
		species= "Dinosaur";

	}
	@Override
	public void reproduce() {

	}
	
	public void move(int i) {
		int myX = myWorld.getCreatureList().get(i).getMyLocation().getX();
		int myY = myWorld.getCreatureList().get(i).getMyLocation().getY();
		Location loc = new Location(myX+1, myY+1);
		myWorld.getCreatureList().get(i).setMyLocation(loc);
	}
	
	public void eatCow() {
		for (int i=0; i<myWorld.getCreatureList().size(); i++) {
			if (myLocation == myWorld.getCreatureList().get(i).getMyLocation()) {
				
			}
			
		}
	}
	
	public void eat() {
		for (int i=0; i<myWorld.getCreatureList().size(); i++) {
			if (myLocation.getX()==myWorld.getCreatureList().get(i).getMyLocation().getX()&&myLocation.getY()==myWorld.getCreatureList().get(i).getMyLocation().getY()) {
				String species2=myWorld.getCreatureList().get(i).getSpecies();
				if(species2.compareTo("Poison Berries")!=0) {
					myWorld.getCreatureList().get(i).setAge(500);
				}else if(species2.compareTo("Poison Berries")==0) {
					myAge=500;
				}
		
			}
			
		}}

}