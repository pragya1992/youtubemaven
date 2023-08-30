package TestNgGroup;

import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void demo1() {
		System.out.println("Hi demo1");
	}
	
	@Test
	public void demo2() {
		System.out.println("Hi demo2");
	}
	
	@Test(groups="SMOKE")
	public void demo3() {
		System.out.println("Hi demo3");
	}
}
