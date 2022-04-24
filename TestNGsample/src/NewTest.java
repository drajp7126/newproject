import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("im in @Test");
  }
  @AfterMethod
  public void beforeMethod() {
	  System.out.println("im in @AfterMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("im in @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("im in @BeforeClass");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im in @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("im in @BeforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("im in @AfterTest ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("im in @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("im in @AfterSuite ");
  }

}
