package dnd;

public abstract class Character extends Subject<Integer> {
	private int level;
	private int health;
	private int experience;
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
		this.notifyObservers(this.level);
	}
	
	public void levelUp() {
		this.level = this.level + 1;
		System.out.println("Level Up auf Level " + level + "!");
		this.notifyObservers(this.level);
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
		this.notifyObservers(this.health);
	}
	
	public void increaseHealth(int healing) {
		this.health = this.health + healing;
		System.out.println("Thanks for the healing of " + healing + "!");
		this.notifyObservers(this.health);
	}
	
	public void decreaseHealth(int damage) {
		this.health = this.health - damage;
		System.out.println("Need healing: " + damage + "!");
		this.notifyObservers(this.health);
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
		this.notifyObservers(this.experience);
	}
	
	public void gainExperience(int amount) {
		this.experience = this.experience + amount;
		System.out.println("Well fought!");
		this.notifyObservers(this.experience);
	}
}
