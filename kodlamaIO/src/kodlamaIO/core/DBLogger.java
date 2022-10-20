package kodlamaIO.core;

import kodlamaIO.entities.MainWindow;

public class DBLogger implements ILogger{

	@Override
	public void log(MainWindow mains) {
		System.out.println("Logged to Database: " + mains.getUniqueName());
	}
	
}
