package core.logging;

public class EmailLogger implements Logger {
	public void log(String text) {
		System.out.println("Log kayd� e-posta olarak g�nderildi : " + text);
	}
}