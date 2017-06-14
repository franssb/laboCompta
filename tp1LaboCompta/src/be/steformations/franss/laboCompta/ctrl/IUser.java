package be.steformations.franss.laboCompta.ctrl;

public interface IUser {
	void setState(StateProgramEnum state);
	StateProgramEnum getState();
}
