import java.awt.Color;

public abstract class Plant extends LifeForm {

	public Plant(Location loc, World w) {
		super(loc, w);
	}
	
	public void reproduce(int index) {
		int chance = rgen.nextInt(1, 10);
		int x= myWorld.getCreatureList().get(index).getMyLocation().getX();
		x += rgen.nextInt(-1, 1);
		int y= myWorld.getCreatureList().get(index).getMyLocation().getY();
		y += rgen.nextInt(-1, 1);
		Location updated = new Location (x,y);
		if (chance>5) {
			if (myWorld.getCreatureList().get(index).getSpecies()=="Grass") {
				myWorld.getCreatureList().add(new Grass(updated, myWorld));
			}
			else if (myWorld.getCreatureList().get(index).getSpecies()=="Flower") {
				myWorld.getCreatureList().add(new Grass(updated, myWorld));
			}
			else if (myWorld.getCreatureList().get(index).getSpecies()=="Mushroom") {
				myWorld.getCreatureList().add(new Grass(updated, myWorld));
			}
			else if (myWorld.getCreatureList().get(index).getSpecies()=="PoisonBerries") {
				myWorld.getCreatureList().add(new Grass(updated, myWorld));
			}
		}
	}
}
