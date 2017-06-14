package be.steformations.franss.laboCompta.vue;

import java.lang.Thread.State;

import be.steformations.franss.laboCompta.ctrl.IUser;
import be.steformations.franss.laboCompta.ctrl.StateProgramEnum;

public class LaboComptaVue {
	
	private IUser iu;
	
	
	public String getScreen(){
		
		StringBuilder sb = new StringBuilder();
		StateProgramEnum state = iu.getState();
		
		switch (state) {
		case INITIAL:
			sb.append("hello");
			sb.append(System.lineSeparator());
			sb.append("creer(1) ou voir(2) un nouveau compte");
			break;
		case CREERCOMPTE:
			sb.append("creer nouveau compte blblbl");
			break;
		case FIN:
			sb.append("bye");
			break;

		}	
		
		return sb.toString();
	}

	public void setUser(IUser iu) {
		this.iu = iu;
	}

}
