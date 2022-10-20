package kodlamaIO.core;

import kodlamaIO.entities.MainWindow;

public class CloudLogger implements ILogger {

	@Override
	public void log(MainWindow mains) {
		System.out.println("Logged to Cloud: " + mains.getUniqueName());
	}

}
