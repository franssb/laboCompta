package be.steformations.franss.laboCompta;

import be.steformations.yannick.application.ConsoleRunner;
import be.steformations.yannick.application.Runner;
import be.steformations.yannick.application.RunnerFactory;

public class comptaAppFactory extends RunnerFactory {

	@Override
	public Runner getRunner() {
		ConsoleRunner runner = new ConsoleRunner();
		comptaApp compta = new comptaApp();
		runner.setApplication(compta);
		
		return runner;
	}

}
