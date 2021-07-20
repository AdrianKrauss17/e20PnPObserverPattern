package dnd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class Exercise1 {
	
	@Test
	void addObserver() {
		Fighter fighter = new Fighter();
		FightClub f = new FightClub(fighter);
		assertTrue(fighter.getObservers().contains(f), "FightClub wird nicht als Observer hinzugefügt!");
		
		Wizard wizard = new Wizard();
		MagicianAcademy m = new MagicianAcademy(wizard);
		assertTrue(wizard.getObservers().contains(m), "MagicianAcademy wird nicht als Observer hinzugefügt!");
		
		Ranger ranger = new Ranger();
		PracticeRange p = new PracticeRange(ranger);
		assertTrue(ranger.getObservers().contains(p), "PracticeRange wird nicht als Observer hinzugefügt!");	
		
	}
	
	@Test
	void changeStrength() {
		Fighter fighter = new Fighter();
		FightClub f = new FightClub(fighter);
		int expected = fighter.getStrength() + 20;
		fighter.increaseStrength(20);
		assertEquals(expected, f.getMemberStrength(), "Observer wird nicht geupdated");
		
		expected = fighter.getStrength() - 20;
		fighter.decreaseStrength(20);
		assertEquals(expected, f.getMemberStrength(), "Observer wird nicht geupdated");
		
		expected = 20;
		fighter.setStrength(20);
		assertEquals(expected, f.getMemberStrength(), "Observer wird nicht geupdated");
	}
	
	@Test
	void changeMana() {
		Wizard wizard = new Wizard();
		MagicianAcademy m = new MagicianAcademy(wizard);
		int expected = wizard.getMana() + 13;
		wizard.increaseMana(13);
		assertEquals(expected, m.getWizardMana(), "Observer wird nicht geupdated!");
		
		expected = wizard.getMana() - 13;
		wizard.decreaseMana(13);
		assertEquals(expected, m.getWizardMana(), "Observer wird nicht geupdated!");
		
		expected = 13;
		wizard.setMana(13);
		assertEquals(expected, m.getWizardMana(), "Observer wird nicht geupdated!");
	}
	
	@Test
	void changeArrows() {
		Ranger ranger = new Ranger();
		PracticeRange r = new PracticeRange(ranger);
		int expected = ranger.getArrows() + 3;
		ranger.increaseArrows(3);
		assertEquals(expected, r.getRangerArrows(), "Observer wird nicht geupdated!");
		
		expected = ranger.getArrows() - 3;
		ranger.decreaseArrows(3);
		assertEquals(expected, r.getRangerArrows(), "Observer wird nicht geupdated!");
		
		expected = 3;
		ranger.setArrows(3);
		assertEquals(expected, r.getRangerArrows(), "Observer wird nicht geupdated!");
	}
}
