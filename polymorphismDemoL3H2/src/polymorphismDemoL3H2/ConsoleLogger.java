package polymorphismDemoL3H2;

public class ConsoleLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to Console : " + message);
	}
}