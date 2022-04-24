package test1;

import org.testng.annotations.Test;

public class NewTest2 {

	@Test(description = "class NewTest2",priority = 1,invocationCount = 5,enabled = false)
	  public void fNewTest2() {
		  System.out.println("im in @Test1NewTest2=================");
	  }
}
