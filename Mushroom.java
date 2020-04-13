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
	
	public void reproduce() {

	}

}
