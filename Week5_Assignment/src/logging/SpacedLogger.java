package logging;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String arg) {
		
		 arg = String.join(" ", arg.split(""));
	     System.out.println(arg);
		
	}

	@Override
	public void Error(String arg) {
		
		arg = String.join(" ", arg.split(""));
	    System.out.println("ERROR: "+arg);
		
	}
	
}
