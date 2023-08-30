package TestNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=0)
	
	public void demo1() {
		System.out.println("Hi Demo1");
	}

	@Test(priority=0)
	
	public void demo2() {
		System.out.println("Hi Demo2");
	}
@Test(priority=-0)
	
	public void demo3() {
		System.out.println("Hi Demo3");
}
}
