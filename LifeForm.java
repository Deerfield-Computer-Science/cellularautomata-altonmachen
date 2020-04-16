import java.awt.Color;
import java.util.ArrayList;

import acm.util.RandomGenerator;

public abstract class LifeForm {
	
	protected World myWorld;
	protected int myLifeSpan;
	protected Location myLocation;
	protected Color myColor;
	protected int myAge;
	protected int mySex;
	protected String species;
	protected boolean alive;
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	// lifeform constructors
	public LifeForm(String species,int myLifeSpan, Location myLocation, Color myColor, World myWorld) {
		super();
		this.myLifeSpan = myLifeSpan;
		this.myLocation = myLocation;
		this.myColor = myColor;
		this.species= species;
		this.myWorld = myWorld; 
		this.mySex = rgen.nextInt(0,1);
		alive = true;
	}
	
	public LifeForm(Location myLocation, World myWorld) {
		super();
		this.myWorld = myWorld;
		this.myLocation = myLocation;
		this.mySex = rgen.nextInt(0,1);
		alive = true;
	}
	
	/* all the basic lifeform functions
	 * 		getOlder
	 * 		reproduce
	 */
	
	// we all age the same, time clicks forward and we all age one unit of time
	public void age(int time){
		myAge+=time;
		if (myAge>myLifeSpan)
			alive=false;
	}
	public abstract void reproduce(int index);
	public abstract void eat();
	public abstract void move();
	
	public boolean isDead(){
		return !alive;
	}
	
	// getter and setters (aka accessors and mutators)
	public int getMyLifeSpan() {
		return myLifeSpan;
	}
	
	public void setMyLifeSpan(int myLifeSpan) {
		this.myLifeSpan = myLifeSpan;
	}
	
	public Location getMyLocation() {
		return myLocation;
	}
	
	public void setMyLocation(Location myLocation) {
		this.myLocation = myLocation;
	}
	
	public Color getMyColor() {
		return myColor;
	}
	
	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}
	
	public int getAge() {
		return myAge;
	}

	public void setAge(int age) {
		this.myAge = age;
	}
	
	public int getSex() {
		return mySex;
	}

	public void setSex(int sex) {
		this.mySex = sex;
	}
	
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
	public String toString() {
		return "LifeForm [species=" + species + "myLifeSpan=" + myLifeSpan + ", myLocation="
				+ myLocation + ", myColor=" + myColor + ", mySex= " + mySex + "]";
	}

	
}
