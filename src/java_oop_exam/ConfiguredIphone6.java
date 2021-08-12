package java_oop_exam;

/*08) Now, Think about Iphone6. 
It also has 5 methods with the same name as materials(). For example -- They are parameterized method (int ramPrice, int cameraPrice), another one (int ramPrice, int cameraPrice, String ProcessorPrice), etc. Can you use the void, parameterized, final, or static method here as the same method name? if yes, create them and take more int variable of your own. What kind of concept you can use? [points: 70]. Instantiate the class in TestPhone and initialize those methods. [points: 70]. Now think about a regular class Name ConfiguredIphone6 which extends Iphone6. Override those methods and change the logic at your own to show the changes. [points: 50]. Show the output in TestPhone. [points: 50]. Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, and single inheritance.*/
public class ConfiguredIphone6 extends Iphone6 {
	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int materials1 = ramPrice + cameraPrice + 400;
		System.out.println("materials1 Price: " + materials1);
		return materials1;

	}

	@Override
	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int materials2 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);// we are getting String to int
																					// (numbers).
		System.out.println("materials2 Price: " + materials2);
		return materials2;

	}

	/*
	 * @Override -( We can not Override Final method) public final int materials(int
	 * ramPrice,int cameraPrice,int headPhonePrice) { int materials3 = ramPrice +
	 * cameraPrice+headPhonePrice; System.out.println("materials3 Price: " +
	 * materials3); return materials3; }
	 */
	// We can not Override Static method .if,we remove the Override annotation
	// static method will belong to present class which is configuredPhone Class .
	public static int materials(int cameraPrice) {
		int materials4 = cameraPrice + 550;
		System.out.println("materials4 Price: " + materials4);
		return materials4;
	}

	@Override
	public void materials() {
		System.out.println("This is a void type Method materials from Iphone6 class");

	}

}
