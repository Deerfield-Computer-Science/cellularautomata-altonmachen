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
		System.out.print("Reproduce");
		int x= myWorld.getCreatureList().get(index).getMyLocation().getX();
		int y= myWorld.getCreatureList().get(index).getMyLocation().getY();
		Location updated = new Location (x,y);
		Location updated2 = new Location(x+1,y);
		Location updated3 = new Location (x-1,y);
		Location updated4= new Location (x, y+1);
		Location updated5 = new Location (x, y-1);
		Location updated6 = new Location (x+1, y+1);
		Location updated7 = new Location (x-1, y-1);
		for (int i=0; i<myWorld.getCreatureList().size(); i++) {
			if ((myWorld.getCreatureList().get(i).getMyLocation().getX()==updated.getX()) && (myWorld.getCreatureList().get(i).getMyLocation().getY())==updated.getY() || (myWorld.getCreatureList().get(i).getMyLocation().getX()==updated2.getX()) && (myWorld.getCreatureList().get(i).getMyLocation().getY())==updated2.getY() || (myWorld.getCreatureList().get(i).getMyLocation().getX()==updated3.getX()) && (myWorld.getCreatureList().get(i).getMyLocation().getY())==updated3.getY() || (myWorld.getCreatureList().get(i).getMyLocation().getX()==updated4.getX()) && (myWorld.getCreatureList().get(i).getMyLocation().getY())==updated4.getY() || (myWorld.getCreatureList().get(i).getMyLocation().getX()==updated5.getX()) && (myWorld.getCreatureList().get(i).getMyLocation().getY())==updated5.getY() || (myWorld.getCreatureList().get(i).getMyLocation().getX()==updated6.getX()) && (myWorld.getCreatureList().get(i).getMyLocation().getY())==updated6.getY() || (myWorld.getCreatureList().get(i).getMyLocation().getX()==updated7.getX()) && (myWorld.getCreatureList().get(i).getMyLocation().getY())==updated7.getY()) {
				if (myWorld.getCreatureList().get(i).getSpecies().compareTo(myWorld.getCreatureList().get(index).getSpecies())==0) {
							if(myWorld.getCreatureList().get(i).getSex()!=myWorld.getCreatureList().get(index).getSex()) {
								Location offspring = new Location(updated.getX()+rgen.nextInt(-1, 1), updated.getY()+rgen.nextInt(-1, 1));
									myWorld.getCreatureList().add(new Dinosaur(offspring, myWorld));
				}
					}
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