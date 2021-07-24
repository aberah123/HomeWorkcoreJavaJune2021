package hw5Q3variableAndMethod;

public class Computer {

	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public void computer() {
		System.out.println("My brand:" + Brand + ", Model :" + Model + ", Operating system:" + OperatingSystem
				+ ", Price:" + price + " and Made in USA?:" + madeInUSA);
	}
}
