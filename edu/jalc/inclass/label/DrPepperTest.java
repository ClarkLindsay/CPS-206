package edu.jalc.inclass.label;

public class DrPepperTest {

	public void testGetHeight(){
		System.out.println("Testing DrPepperLogo::getHeight");
		DrPepperLogo drPepperLogo = new DrPepperLogo(8);
		assert(drPepperLogo.getHeight() == 8);

	}

	public static void main(String... args){
		DrPepperTest drPepperTest = new DrPepperTest();
		drPepperTest.testGetHeight();
		System.out.println("DrPepperLogoTest completed");
	}
}