package E2Eproject;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;

public class HomePage extends Base {
	
	
	@Test
	public void basePageNavigation() throws IOException {
		driver = initApplication();
		driver.get("https://www.google.com");
	}

}
