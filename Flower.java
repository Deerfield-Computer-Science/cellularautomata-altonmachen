import java.awt.Color;
import java.util.ArrayList;

public class Flower extends Plant {
	
	public Flower(Location l, World w) {
		super(l,w);
		myLifeSpan = 2;
		myColor= Color.YELLOW;
		species= "Flower";
	}
	
	public void reproduce() {

	}

}