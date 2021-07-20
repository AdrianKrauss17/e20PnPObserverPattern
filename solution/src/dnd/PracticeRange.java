package dnd;

public class PracticeRange implements Observer<Integer> {

	private int rangerArrows;
	private final Ranger ranger;
	
	public PracticeRange(Ranger ranger) {
		this.ranger = ranger;
		this.ranger.addObserver(this);
		this.rangerArrows = this.ranger.getArrows();
	}

	@Override
	public void onUpdate(Integer newState) {
		// TODO Auto-generated method stub
		this.rangerArrows = newState;
	}

	public int getRangerArrows() {
		return rangerArrows;
	}

	public void setRangerArrows(int rangerArrows) {
		this.rangerArrows = rangerArrows;
	}

	public Ranger getRanger() {
		return ranger;
	}

	
}
