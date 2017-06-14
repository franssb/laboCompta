package be.steformations.franss.laboCompta.ctrl;

import be.steformations.franss.laboCompta.vue.LaboComptaVue;

public class LaboComptaCtrl {

	private LaboComptaVue vue;
	private IUser iu;
	private CompteBuilder cpbuilder = new CompteBuilder();

	public Boolean newAction(String input) {
		Boolean action = false;


		switch (iu.getState()) {
		case INITIAL:
			switch (input) {
			case "1":
				iu.setState(StateProgramEnum.CREERCOMPTE);
				action = true;
				break;
			case "q":
				iu.setState(StateProgramEnum.FIN);
				break;
			default:
				break;
			}
			break;
		case CREERCOMPTE:
//			if etatbuilder == DIVISABLE
			 cpbuilder.setDivisable(input);
//			 setstate etatbuilder.NUM
			
			cpbuilder.setNum(input);
			cpbuilder.setLibel(input);
			cpbuilder.setPos(input);
			cpbuilder.newCompte();
			action = true;
			break;
		case FIN:
			action = false;
			break;
		default:
			break;
		}

		return action;
	}

	public void setVue(LaboComptaVue vue) {
		this.vue = vue;

	}

	public void setUser(IUser iu) {
		this.iu = iu;

	}
}
