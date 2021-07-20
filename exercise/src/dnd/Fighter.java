package dnd;

public class Fighter extends Character {
	private int strength;
	
	public Fighter() {
		this.setExperience(42);
		this.setLevel(7);
		this.setHealth(50);
		this.strength = 3;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void increaseStrength(int amount) {
		this.strength = strength + amount;
		System.out.println("I'm getting stronger!");
	}
	
	public void decreaseStrength(int amount) {
		this.strength = strength - amount;
		System.out.println("I am weak!");
	}
}
