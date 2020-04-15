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
	public void reproduce(int index) {
			int x= myWorld.getCreatureList().get(index).getMyLocation().getX();
			x += rgen.nextInt(-1, 1);
			int y= myWorld.getCreatureList().get(index).getMyLocation().getY();
			y += rgen.nextInt(-1, 1);
			Location updated = new Location (x,y);
			for (int i=0; i<myWorld.getCreatureList().size(); i++) {
				if ((myWorld.getCreatureList().get(i).getMyLocation()==updated)&&(myWorld.getCreatureList().get(i).getSpecies()==myWorld.getCreatureList().get(index).getSpecies())&&(myWorld.getCreatureList().get(i).getSex()!=myWorld.getCreatureList().get(index).getSex())) {
					Location offspring = new Location(updated.getX()+rgen.nextInt(-1, 1), updated.getY()+rgen.nextInt(-1, 1));
						myWorld.getCreatureList().add(new Dinosaur(offspring, myWorld));
					}
				}
			}
		
	
	
	public void move(int i) {
		int myX = myWorld.getCreatureList().get(i).getMyLocation().getX();
		int myY = myWorld.getCreatureList().get(i).getMyLocation().getY();
		Location loc = new Location(myX+1, myY+1);
		myWorld.getCreatureList().get(i).setMyLocation(loc);
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