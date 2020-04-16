import java.awt.Color;

public abstract class Animal extends LifeForm {

	public Animal(Location loc, World w) {
		super(loc, w);
	}
	 
	public abstract void reproduce(int index);
	public void move() {
		int x = myLocation.getX();
		int y = myLocation.getY();
		x+= rgen.nextInt(-1,1);
		y+= rgen.nextInt(-1,1);
		myLocation.setX(x);
		myLocation.setY(y);
	} 
	
			
		
	
	
	
	
	
	
	
	
	
}
