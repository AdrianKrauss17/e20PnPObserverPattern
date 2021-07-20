package dnd;

public class FightClub implements Observer<Integer> {
	private int memberStrength;
	private final Fighter member;
	
	public FightClub(Fighter member) {
		this.member = member;
		this.member.addObserver(this);
		this.memberStrength = this.member.getStrength();
	}

	@Override
	public void onUpdate(Integer newState) {
		// TODO Auto-generated method stub
		this.memberStrength = newState;
	}

	public int getMemberStrength() {
		return memberStrength;
	}

	public void setMemberStrength(int memberStrength) {
		this.memberStrength = memberStrength;
	}

	public Fighter getMember() {
		return member;
	}
	
}
