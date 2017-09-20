package maven_demo_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
  @Test
  public void assertDemo1() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Ask-Selenium\\chromedriver_win32(3)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://rediffmail.com");
	  String a=driver.getTitle();
	  System.out.println(a);
	  System.out.println("assert 1 executed");

	  //Assert.assertTrue(1>2);
	  //Assert.assertEquals(a, "rediffmail.com", "expected and actual are not same");
	  //Assert.assertTrue(a.contains("Rediff"));
	  SoftAssert soft=new SoftAssert();
	  soft.assertAll();
	  
	  System.out.println("assert 2 executed");
	  
}
  @Test(dependsOnMethods={"assertDemo1"})
  public void assertDemo2(){
	  System.out.println("assert demo2");
  }
}
