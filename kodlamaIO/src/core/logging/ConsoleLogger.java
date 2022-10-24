package core.logging;

public class ConsoleLogger implements Logger {
	public void log(String text) {
		System.out.println("Console üzerinden log gösterildi : " + text);
	}
}