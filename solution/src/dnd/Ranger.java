package dnd;

public class Ranger extends Character {
private int arrows;
	
	public Ranger() {
		this.setExperience(42);
		this.setLevel(7);
		this.setHealth(50);
		this.arrows = 12;
	}

	public int getArrows() {
		return arrows;
	}

	public void setArrows(int arrows) {
		this.arrows = arrows;
		this.notifyObservers(this.arrows);
	}
	
	public void increaseArrows(int amount) {
		this.arrows = arrows + amount;
		System.out.println("Thanks for the arrows!");
		this.notifyObservers(this.arrows);
	}
	
	public void decreaseArrows(int amount) {
		this.arrows = arrows - amount;
		System.out.println("Need more ammo!");
		this.notifyObservers(this.arrows);
	}
}
