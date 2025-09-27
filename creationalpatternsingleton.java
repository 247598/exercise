package exercise1;

//public class creationalpatternsingleton {
//
//	public creationalpatternsingleton() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

class Logger {
	 // Static instance
	 private static Logger instance;

	 // Private constructor prevents instantiation
	 private Logger() {}

	 // Global access point
	 public static Logger getInstance() {
	     if (instance == null) {
	         instance = new Logger();
	     }
	     return instance;
	 }

	 // Logging method
	 public void log(String message) {
	     System.out.println("LOG: " + message);
	 }
	}

	//Driver class
	public class creationalpatternsingleton {
	 public static void main(String[] args) {
	     Logger logger1 = Logger.getInstance();
	     Logger logger2 = Logger.getInstance();

	     logger1.log("This is the first log message.");
	     logger2.log("This is the second log message.");

	     // Verify both references point to the same instance
	     System.out.println("logger1 == logger2 ? " + (logger1 == logger2));
	 }
	}
