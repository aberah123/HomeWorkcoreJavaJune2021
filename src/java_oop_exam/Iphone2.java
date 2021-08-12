package java_oop_exam;

/* 07) Again, from Iphone1, we got 4 private variables we know. 
 * Create 2 constructors inside it using that 4 private variables -- default and parameterized after those variables.
 * In IPhone2, declare a char variable userOfIphone2 (M or F). 
 * create default and parameterized constructor, a void type method iPhone2Info, a parameterized method with same name iPhone2Info inside Iphone2 class. 
 * Use the super method and super keyword in constructor, and super keyword in methods of Iphone2.
 * Call constructor and methods.
 * Can you call variable by super keyword?
 * create a public variable inside Iphone1 and execute it in Iphone2. 
 * Execute all of them in TestPhone.
 */

public class Iphone2 extends Iphone1 {

	char userOfIphone2;

	public Iphone2() {
		// super();
		super(750, "I bought this phone in 2000", 'F', false);
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I bought this phone  in 2000");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.compass();
		super.regularClassInfo();
		super.appleWatchInfo();
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.Color = "Green";// We can not call a private variable but we can call a public variable
		super.grade = 'A';
		System.out.println("iphone1 color:" + Color + "iphone1 grade:" + grade);
		System.out.println(" This is a default constructor from Iphone2 class");

	}

	public Iphone2(char userOfIphone2) {
		super();
		// super(750,"I bought this phone in 2000", 'F',false);
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I bought this phone  in 2000");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.compass();
		super.regularClassInfo();
		super.appleWatchInfo();
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.Color = "Green";// We can not call a private variable but we can call a public variable
		super.grade = 'A';
		System.out.println("iphone1 color:" + Color + "iphone1 grade:" + grade);
		System.out.println("This is a parameterized constructor from Iphone2 class");

	}

	public void iphone2Info() {
		// super();// We can not call the constructors inside of method by super keyword
		// super(750,"I bought this phone in 2000", 'F',false);
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I bought this phone  in 2000");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.compass();
		super.regularClassInfo();
		super.appleWatchInfo();
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.Color = "Green";// We can not call a private variable but we can call a public variable
		super.grade = 'A';
		System.out.println("iphone1 color:" + Color + "iphone1 grade:" + grade);
		System.out.println("Here void type method is implemented");

	}

	public void iphone2Info(char userOfIohone2) {
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I bought this phone  in 2000");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.compass();
		super.regularClassInfo();
		super.appleWatchInfo();
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.Color = "Green";// We can not call a private variable but we can call a public variable
		super.grade = 'A';
		System.out.println("iphone1 color:" + Color + "iphone1 grade:" + grade);
		System.out.println("Here parameterized method is implemented");

	}

	public void youtube() {
		super.getPrice();
		super.getInfo();
		super.getUser();
		super.isMadeInUSA();
		super.setPrice(750);
		super.setInfo("I bought this phone  in 2000");
		super.setUser('F');
		super.setMadeInUSA(false);
		super.compass();
		super.regularClassInfo();
		super.appleWatchInfo();
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.Color = "Green";// We can not call a private variable but we can call a public variable
		super.grade = 'A';
		System.out.println("iphone1 color:" + Color + "iphone1 grade:" + grade);
		System.out.println("youtube is introduce in Iphone2.The price is increased to 750$");
	}
}
