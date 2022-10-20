package kodlamaIO.core;

import kodlamaIO.entities.MainWindow;

public class FileLogger implements ILogger{

	@Override
	public void log(MainWindow mains) {
		System.out.println("Logged to File: " + mains.getUniqueName());
	}


	
}
