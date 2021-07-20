package dnd;

public class MagicianAcademy implements Observer<Integer> {
	
	private int wizardMana;
	private final Wizard wizard;
	
	public MagicianAcademy(Wizard wizard) {
		this.wizard = wizard;
		this.wizard.addObserver(this);
		this.wizardMana = this.wizard.getMana();
	}

	@Override
	public void onUpdate(Integer newState) {
		// TODO Auto-generated method stub
		this.wizardMana = newState;
	}

	public int getWizardMana() {
		return wizardMana;
	}

	public void setWizardMana(int wizardMana) {
		this.wizardMana = wizardMana;
	}

	public Wizard getWizard() {
		return wizard;
	}
	
}
