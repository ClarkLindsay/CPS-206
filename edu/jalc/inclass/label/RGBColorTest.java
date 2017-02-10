package edu.jalc.inclass.label;

public class RGBColorTest {

	public static void testGetRed(){
		System.out.println("Testing RGBColor:getRed");
		RGBColor rgbColor = new RGBColor(20, 1, 4);
		assert(rgbColor.getRed() == 20);
	}

	public static void testGetGreen(){
		System.out.println("Testing RGBColor:getGreen");
		RGBColor rgbColor = new RGBColor(20, 1, 4);
		assert(rgbColor.getRed() == 1);
	}

	public static void testGetBlue(){
		System.out.println("Testing RGBColor:getBlue");
		RGBColor rgbColor = new RGBColor(20, 1, 4);
		assert(rgbColor.getRed() == 4);
	}

	public static void main(String[] args){
		testGetRed();
		testGetGreen();
		testGetBlue();

		System.out.println("RGBColorTest Completed");
	}
}