import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class calculatorPage {
	  WebDriver driver;

	public void no(int c) {
		String d = Integer.toString(c);
		if(d.charAt(0) == '-'){
			  for(int i = 0; i <d.length();i++) {
				  if(i == 0) {
					  driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
				  }else {
					   driver.findElement(By.xpath("//span[@onclick='r("+ d.charAt(i) +")']")).click();
				  }
			  }
		  }else {
			  for(int i = 0; i <d.length();i++) {
				   driver.findElement(By.xpath("//span[@onclick='r("+ d.charAt(i) +")']")).click();
			  }
		  }
	}
	public void operation(char a) {
		  driver.findElement(By.xpath("//span[@onclick=\"r('"+ a +"')\"]")).click();	
	}
	
	public String result() {
		  String s = driver.findElement(By.id("sciOutPut")).getText();	
		  Double i=Double.parseDouble(s);  
		  double j =(double)Math.round(i * 100000d) / 100000d;
		  String v = String.valueOf(j);

		  return v;
	}
	
	public calculatorPage(WebDriver a) {
		this.driver = a;
		
	}

}
