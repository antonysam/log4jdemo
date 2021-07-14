package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import template.Golden_template;

public class Demolog {

	@Test
	public void testlog() {

		
		
		Logger logger = Logger.getLogger("Demolog");
		PropertyConfigurator.configure("log4j.properties");
		Golden_template.openbrowser("chrome");
		logger.info("opened the browser");
		Golden_template.getURL("https://opensource-demo.orangehrmlive.com/", 10, 10);
		
	}
}
