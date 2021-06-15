import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class calculator {
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		driverfactory drv= new driverfactory();
		  driver = drv.Open("chrome");
		  driver.get("https://www.calculator.net/");
		  driver.manage().window().maximize();
	}
		
  @Test
  public void test() {
	  int a = 423;
	  int b = 525;
	  char k = '*';
	  double  c = (double)a * b;
	  double j =(double)Math.round(c * 100000d) / 100000d;
	  String s = String.valueOf(j);
	  calculatorPage cal = new calculatorPage(driver);
	  cal.no(a);
	  cal.operation(k);
	  cal.no(b);
	  Assert.assertEquals(cal.result(), s);
	  System.out.println("expected:"+s+"found:"+cal.result());
  }
  @Test
  public void test0() {
	  int a = 4000;
	  int b = 200;
	  char k = '/';
	  double  c = (double)a / b;
	  double j =(double)Math.round(c * 100000d) / 100000d;
	  String s = String.valueOf(j);
	  calculatorPage cal = new calculatorPage(driver);
	  cal.no(a);
	  cal.operation('/');
	  cal.no(b);
	  Assert.assertEquals(cal.result(), s);	  
	  System.out.println("expected:"+s+"found:"+cal.result());

  }
  @Test
  public void test1() {
	  int a = -234234;
	  int b = 345345;
	  char k = '+';
	  double  c = (double)a + b;
	  double j =(double)Math.round(c * 100000d) / 100000d;
	  String s = String.valueOf(j);
	  calculatorPage cal = new calculatorPage(driver);
	  cal.no(a);
	  cal.operation('+');
	  cal.no(b);
	  Assert.assertEquals(cal.result(), s);	  
	  System.out.println("expected:"+s+"found:"+cal.result());

  }
  @Test
  public void test2() {
	  int a = -234823;
	  int b = -23094823;
	  char k = '-';
	  double  c = (double)a - b;
	  double j =(double)Math.round(c * 100000d) / 100000d;
	  String s = String.valueOf(j);
	  calculatorPage cal = new calculatorPage(driver);
	  cal.no(a);
	  cal.operation('-');
	  cal.no(b);
	  Assert.assertEquals(cal.result(), s);	  
	  System.out.println("expected:"+s+"found:"+cal.result());

  }
  
  
  @AfterMethod
	public void Teardown() {
		driver.quit();
	}
	  
}

