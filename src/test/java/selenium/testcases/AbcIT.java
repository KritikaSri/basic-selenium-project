package selenium.testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AbcIT {

	@Test
	public void f() {
		WebDriver webDriver = new RemoteWebDriver(DesiredCapabilities.firefox());
		webDriver.get("http://www.python.org");
		webDriver.getTitle();
	}
}
