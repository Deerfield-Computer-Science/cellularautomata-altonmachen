import java.awt.Color;

public abstract class Animal extends LifeForm {

	public Animal(Location loc, World w) {
		super(loc, w);
	}
	
	public void eat() {
		for (int i=0; i<myWorld.getCreatureList().size(); i++) {
			if (myLocation.getX()==myWorld.getCreatureList().get(i).getMyLocation().getX()&&myLocation.getY()==myWorld.getCreatureList().get(i).getMyLocation().getY()) {
				String species2=myWorld.getCreatureList().get(i).getSpecies();	
			}
			
		}
		
	}
	
	public void reproduce(int index) {
		int x= myWorld.getCreatureList().get(index).getMyLocation().getX();
		x += rgen.nextInt(-1, 1);
		int y= myWorld.getCreatureList().get(index).getMyLocation().getY();
		y += rgen.nextInt(-1, 1);
		Location updated = new Location (x,y);
		for (int i=0; i<myWorld.getCreatureList().size(); i++) {
			if ((myWorld.getCreatureList().get(i).getMyLocation()==updated)&&(myWorld.getCreatureList().get(i).getSpecies()==myWorld.getCreatureList().get(index).getSpecies())&&(myWorld.getCreatureList().get(i).getSex()!=myWorld.getCreatureList().get(index).getSex())) {
				Location offspring = new Location(updated.getX()+rgen.nextInt(-1, 1), updated.getY()+rgen.nextInt(-1, 1));
				if (myWorld.getCreatureList().get(index).getSpecies()=="Cow") {
					myWorld.getCreatureList().add(new Cow(offspring, myWorld));
				}
				else if (myWorld.getCreatureList().get(index).getSpecies()=="Dinosaur") {
					myWorld.getCreatureList().add(new Dinosaur(offspring, myWorld));
				}
				else if (myWorld.getCreatureList().get(index).getSpecies()=="Finch") {
					myWorld.getCreatureList().add(new Finch(offspring, myWorld));
				}
				else if (myWorld.getCreatureList().get(index).getSpecies()=="Human") {
					myWorld.getCreatureList().add(new Human(offspring, myWorld));
				}
			}
		}
	}
	
	
	
	
	
	
	
}
