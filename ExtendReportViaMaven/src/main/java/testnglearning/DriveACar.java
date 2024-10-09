package testnglearning;

import org.testng.annotations.Test;

public class DriveACar {
	@Test(priority=0)
	public void StartTheCar() {
		System.out.println("Start The car");
		
	}
	@Test(priority=1)
	public void putTheFirstGear() {
		System.out.println("First Gear");
		
	}
	@Test(priority=2)
	public void putTheSecondtGear() {
		System.out.println("Second Gear");
		
	}
	@Test(priority=3)
	public void putTheThirdGear() {
		System.out.println("Third car");
		
	}
	@Test(priority=4)
	public void putTheFourthGear() {
		System.out.println("Fourth car");
		
	}
}
