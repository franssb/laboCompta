package be.steformations.franss.laboCompta;

import be.steformations.franss.laboCompta.ctrl.IUser;
import be.steformations.franss.laboCompta.ctrl.LaboComptaCtrl;
import be.steformations.franss.laboCompta.vue.LaboComptaVue;
import be.steformations.yannick.application.Application;

public class ComptaApp implements Application {

	LaboComptaVue currentView;
	LaboComptaCtrl controleur;
	private IUser theUser;
	
	
	@Override
	public String getScreen() {

		return currentView.getScreen();
	}

	@Override
	public boolean isFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void newInput(String arg0) {
		controleur.newAction(arg0);

	}

	public void setUser(IUser ui) {
		this.theUser = ui;
	}

	public void setControleur(LaboComptaCtrl controleur) {
		this.controleur = controleur;
	}

	public void setView(LaboComptaVue vue) {
		this.currentView = vue;
		
	}
	
}
