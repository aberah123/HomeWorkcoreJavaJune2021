package hw5Q4Constructor;


public class Computer {
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public Computer() {
		System.out.println("This is from default constructor");
	}

	public Computer(String Brand, String Model, String OperatingSystem, int price, char grade, boolean madeInUSA) {
		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand: " + Brand + ", Model : " + Model + ", Operating system : " + OperatingSystem
				+ ", Price : " + price + ", Grade: " + grade + ", and Made in USA? : " + madeInUSA);
	}

	public Computer(String Brand) {
		this.Brand = Brand;
		System.out.println("My brand: " + Brand);
	}

	public Computer(String Brand, int price, char grade) {
		this.Brand = Brand;
		this.price = price;
		this.grade = grade;
		System.out.println("My brand: " + Brand + ", Price: " + price + ", Grade: " + grade);
	}

	public Computer(String Brand, String Model, String OperatingSystem, boolean madeInUSA, int price) {
		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand: " + Brand + ", Model : " + Model + ", Operating system : " + OperatingSystem
				+ ", Price : " + price + ", and Made in USA? : " + madeInUSA);
	}

}
		
		
		
		

	
