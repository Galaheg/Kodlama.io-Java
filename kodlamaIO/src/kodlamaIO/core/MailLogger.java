package kodlamaIO.core;

import kodlamaIO.entities.MainWindow;

public class MailLogger implements ILogger{

	@Override
	public void log(MainWindow mains) {
		System.out.println("Logged to Mail: " + mains.getUniqueName());
	}



}
