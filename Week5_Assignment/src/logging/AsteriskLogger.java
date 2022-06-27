package logging;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String arg) {
		System.out.println("***"+arg+"***");
		
	}

	@Override
	public void Error(String arg) {
		System.out.println("*****************\r\n"
						 + "***Error:" +arg+"***\r\n"
						 + "*****************");
		
	}
	
}
