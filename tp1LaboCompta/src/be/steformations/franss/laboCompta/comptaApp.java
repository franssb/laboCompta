package be.steformations.franss.laboCompta;

import be.steformations.yannick.application.Application;

public class comptaApp implements Application {

	@Override
	public String getScreen() {
		String screen = "hello bonjour";
		return screen;
	}

	@Override
	public boolean isFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void newInput(String arg0) {
		// TODO Auto-generated method stub

	}

}
