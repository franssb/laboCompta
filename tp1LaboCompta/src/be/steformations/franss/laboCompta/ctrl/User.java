package be.steformations.franss.laboCompta.ctrl;

public class User implements IUser {
	StateProgramEnum state;

	public User(){
		setState(StateProgramEnum.INITIAL);
	}
	
	@Override
	public void setState(StateProgramEnum state) {
		this.state = state;
		
	}

	@Override
	public StateProgramEnum getState() {
		return state;
	}
}
