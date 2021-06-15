

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.opera.OperaDriver;
	import org.openqa.selenium.safari.SafariDriver;

public class driverfactory {
		public WebDriver Open(String drv) {
			if(drv.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\codewring\\eclipse-workspace\\automation testing\\driver\\geckodriver.exe");
				System.out.println("Using Firefox");

				return  new FirefoxDriver();
				
			}
			else if(drv.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\codewring\\eclipse-workspace\\automation testing\\driver\\chromedriver.exe");
				System.out.println("Using Chrome");

				return  new ChromeDriver();
			}
			else if(drv.equals("ie")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\codewring\\eclipse-workspace\\automation testing\\driver\\geckodriver.exe");
				System.out.println("Using Internet Explorer");

				return new InternetExplorerDriver();
			}
			else if(drv.equals("opera") ) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\codewring\\eclipse-workspace\\automation testing\\driver\\geckodriver.exe");
				System.out.println("Using Opera Web Browser");

				return  new OperaDriver();
			}
			else if(drv.equals("safari")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\codewring\\eclipse-workspace\\automation testing\\driver\\geckodriver.exe");
				System.out.println("Using Safari");

				return  new SafariDriver();
			}
			else{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\codewring\\eclipse-workspace\\automation testing\\driver\\geckodriver.exe");
				System.out.println("Using Microsoft edge");
				return  new EdgeDriver();
			}
		} 
}
	

