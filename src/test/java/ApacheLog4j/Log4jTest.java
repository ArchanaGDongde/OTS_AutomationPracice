package ApacheLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest 
{
	private static Logger logger = LogManager.getLogger(Log4jTest.class.getName());
	
	public static void main(String[] args)
	{
		System.out.println("Laogger name : "+ logger);
		System.out.println("Hello world");
		logger.trace("This is trace level");
		logger.info("This is information");
		logger.error("This is error message");
		logger.warn("This is warning  message");
		logger.fatal("This is a fatal message");
		 
				
		System.out.println("Completed"); 
	}

}
