package logging;

public class App {
	
	public static void main(String[] args) {
		
		Logger asterisklogger = new AsteriskLogger(); 
		
		asterisklogger.Log("Hello");
		
		asterisklogger.Error("Hello");
		
		Logger spacedlogger = new SpacedLogger();
		
		spacedlogger.Log("Hello");
		
		spacedlogger.Error("Hello");
	}

}
