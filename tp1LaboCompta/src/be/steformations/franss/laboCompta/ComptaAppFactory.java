package be.steformations.franss.laboCompta;

import be.steformations.franss.laboCompta.ctrl.IUser;
import be.steformations.franss.laboCompta.ctrl.LaboComptaCtrl;
import be.steformations.franss.laboCompta.ctrl.User;
import be.steformations.franss.laboCompta.vue.LaboComptaVue;
import be.steformations.yannick.application.ConsoleRunner;
import be.steformations.yannick.application.Runner;
import be.steformations.yannick.application.RunnerFactory;

public class ComptaAppFactory extends RunnerFactory {

	@Override
	public Runner getRunner() {
		ConsoleRunner runner = new ConsoleRunner();
		ComptaApp compta = new ComptaApp();
		IUser iu = new User();
		LaboComptaCtrl control = new LaboComptaCtrl();
		LaboComptaVue vue = new LaboComptaVue();
		
		
		vue.setUser(iu);
		runner.setApplication(compta);
		control.setVue(vue);
		control.setUser(iu);
		compta.setView(vue);
		compta.setControleur(control);

		
		return runner;
	}

}
