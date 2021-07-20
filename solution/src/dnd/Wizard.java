package dnd;

public class Wizard extends Character {
	private int mana;
	
	public Wizard() {
		this.setExperience(42);
		this.setLevel(7);
		this.setHealth(50);
		this.mana = 35;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
		this.notifyObservers(this.mana);
	}
	
	public void increaseMana(int amount) {
		this.mana = mana + amount;
		System.out.println("Unlimited power!");
		this.notifyObservers(this.mana);
	}
	
	public void decreaseMana(int amount) {
		this.mana = mana - amount;
		System.out.println("Need to refuel!");
		this.notifyObservers(this.mana);
	}
}
