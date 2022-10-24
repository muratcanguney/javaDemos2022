package polymorphismDemoL3H2;

public class Main {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.log("Log mesaj�");

		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
				new ConsoleLogger() };

		for (BaseLogger logger1 : loggers) {
			logger1.log("Log mesaj�");
		}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}
}