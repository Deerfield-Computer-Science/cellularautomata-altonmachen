import java.awt.Color;
import java.util.ArrayList;

public class PoisonBerries extends Plant {
	
	public PoisonBerries(Location l, World w) {
		super(l,w);
		myLifeSpan = 2;
		myColor= Color.MAGENTA;
		species= "Poison Berries";
	}
	
	public void reproduce() {
		
	}
	}


