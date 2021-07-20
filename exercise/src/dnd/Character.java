package dnd;

public abstract class Character {
	private int level;
	private int health;
	private int experience;
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void levelUp() {
		this.level = this.level + 1;
		System.out.println("Level Up auf Level " + level + "!");
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void increaseHealth(int healing) {
		this.health = this.health + healing;
		System.out.println("Thanks for the healing of " + healing + "!");
	}
	
	public void decreaseHealth(int damage) {
		this.health = this.health - damage;
		System.out.println("Need healing: " + damage + "!");
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void gainExperience(int amount) {
		this.experience = this.experience + amount;
		System.out.println("Well fought!");
	}
}
