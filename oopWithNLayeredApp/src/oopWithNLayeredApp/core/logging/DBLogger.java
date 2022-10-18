package oopWithNLayeredApp.core.logging;

public class DBLogger implements Logger{
	@Override
	public void log(String data) {
	
		System.out.println("Logged to DB: "+data );
	}

}
